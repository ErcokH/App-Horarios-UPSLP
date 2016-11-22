package teamhorario.upslp.apphorariosupslp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.R.*;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import org.json.JSONArray;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button siguiente;
    EditText txtac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txtac = (EditText) findViewById(R.id.txtmat);
        siguiente= (Button) findViewById(R.id.btnacc);
        siguiente.setOnClickListener(this);
    }
    public String enviardatosget(String usu){
        URL url= null;
        String linea;
        int respuesta = 0;
        StringBuilder result=null;
        try
        {
            url = new URL("http://wap2.esy.es//verificar_login.php?usu="+usu);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            respuesta = connection.getResponseCode();
            result = new StringBuilder();
            if(respuesta==HttpURLConnection.HTTP_OK)
            {
                InputStream in = new BufferedInputStream(connection.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                while ((linea=reader.readLine())!= null)
                {
                    result.append(linea);
                }

            }
        }catch(Exception e){}

    return result.toString();
    }
    public int obtDatosJSON(String response)
    {
        int res = 0;
        try {
            JSONArray json = new JSONArray(response);
            if(json.length()>0)
            {
                res=1;
            }

        }catch (Exception e)
        {

        }
        return res;
    }

    @Override
    public void onClick(View v) {
        Thread tr = new Thread(){
            @Override
            public void run() {
                super.run();
                final String resultado = enviardatosget(txtac.getText().toString());
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        int r=obtDatosJSON(resultado);
                        if(r>0)
                        {
                            Intent i = new Intent(getApplicationContext(), NotificacionesActivity.class);
                            i.putExtra("mat",txtac.getText().toString());
                            startActivity(i);
                        }else{
                            Toast.makeText(getApplicationContext(),"Matricula no Registrada", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        };
       tr.start();
    }
}

