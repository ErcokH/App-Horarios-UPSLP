package teamhorario.upslp.apphorariosupslp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.R.*;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class WelcomeActivity extends AppCompatActivity {

    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        siguiente= (Button) findViewById(R.id.btnacc);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(WelcomeActivity.this, NotificacionesActivity.class);
                startActivity(siguiente);
            }
        });
    }

}

