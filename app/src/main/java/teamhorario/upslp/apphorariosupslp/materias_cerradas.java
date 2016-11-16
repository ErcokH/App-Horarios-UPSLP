package teamhorario.upslp.apphorariosupslp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class materias_cerradas extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materias_disponibles);
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
                Intent siguiente = new Intent( materias_cerradas.this, NotificacionesActivity.class);
                startActivity(siguiente);
            case R.id.cerradas:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent siguiente1 = new Intent( materias_cerradas.this, materias_cerradas.class);
                startActivity(siguiente1);
            case R.id.disponibles:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent siguiente2 = new Intent( materias_cerradas.this, materias_disponibles.class);
                startActivity(siguiente2);
            case R.id.mihorario:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent siguiente3 = new Intent( materias_cerradas.this, MihorarioActivity.class);
                startActivity(siguiente3);
        }

        return super.onOptionsItemSelected(item);
    }
}
