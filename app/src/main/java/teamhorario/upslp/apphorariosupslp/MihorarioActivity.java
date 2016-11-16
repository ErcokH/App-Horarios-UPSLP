package teamhorario.upslp.apphorariosupslp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by LuisEnrique on 16/11/2016.
 */
public class MihorarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mihorario);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.notificaciones:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent siguiente = new Intent(MihorarioActivity.this, NotificacionesActivity.class);
                startActivity(siguiente);
            case R.id.cerradas:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent siguiente1 = new Intent(MihorarioActivity.this, materias_cerradas.class);
                startActivity(siguiente1);
            case R.id.disponibles:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent siguiente2 = new Intent(MihorarioActivity.this, materias_disponibles.class);
                startActivity(siguiente2);
            case R.id.mihorario:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent siguiente3 = new Intent(MihorarioActivity.this, MihorarioActivity.class);
                startActivity(siguiente3);
        }

        return super.onOptionsItemSelected(item);
    }
}
