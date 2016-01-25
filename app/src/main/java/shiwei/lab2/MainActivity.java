package shiwei.lab2;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        showPop("App Started");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v){
        TextView textview = (TextView) findViewById(R.id.textView);

        ImageButton b = (ImageButton) findViewById(v.getId());

        int a = 10;
        if(v.getId() == R.id.imageButton){
            textview.setText("Button 1");
        }
        else{
            textview.setText("Button 2");
        }

        if(v.getTag().equals("1")){
            b.setBackgroundResource(R.drawable.signcheck);
            v.setTag(getString(R.string.int2));
        }
        else{
            b.setBackgroundResource(R.drawable.x);
            v.setTag(getString(R.string.int1));
        }

        ImageButton b1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton b2 = (ImageButton) findViewById(R.id.imageButton2);
        if(b1.getTag().equals(b2.getTag())){
            showPop("Same Image");
        }

    }

    public void showPop(String s){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, s, duration);
        toast.show();

    }
}
