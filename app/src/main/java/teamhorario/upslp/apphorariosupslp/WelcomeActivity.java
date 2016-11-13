package teamhorario.upslp.apphorariosupslp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class WelcomeActivity extends AppCompatActivity {
    Spinner lista;
    String[] datos = {"ITI","ITEM"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        lista=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        lista.setAdapter(adaptador);
    }
}
