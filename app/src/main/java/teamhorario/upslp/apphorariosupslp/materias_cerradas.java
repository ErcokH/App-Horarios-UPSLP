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
        setContentView(R.layout.materias_cerradas);
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
                Intent siguiente = new Intent(this, NotificacionesActivity.class);
                startActivity(siguiente);
                break;
            case R.id.cerradas:
                Intent siguiente1 = new Intent(this, materias_cerradas.class);
                startActivity(siguiente1);
                break;
            case R.id.disponibles:
                Intent siguiente2 = new Intent(this, materias_disponibles.class);
                startActivity(siguiente2);
                break;
            case R.id.mihorario:
                Intent siguiente3 = new Intent(this, MihorarioActivity.class);
                startActivity(siguiente3);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
}
