package com.triwahyuprasetyo.prsdpwhy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.triwahyuprasetyo.prsdpwhy.oop.AirPutih;
import com.triwahyuprasetyo.prsdpwhy.oop.JusMelon;
import com.triwahyuprasetyo.prsdpwhy.oop.Minuman;
import com.triwahyuprasetyo.prsdpwhy.oop.SirupStrawberry;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextPrintOut;
    private Button buttonOverride, buttonOverload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        editTextPrintOut = (EditText) findViewById(R.id.editTextPrintOut);
        buttonOverride = (Button) findViewById(R.id.buttonOverride);
        buttonOverload = (Button) findViewById(R.id.buttonOverload);
        buttonOverride.setOnClickListener(this);
        buttonOverload.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == buttonOverride.getId()) {
            //Toast.makeText(getApplicationContext(),"or",Toast.LENGTH_LONG).show();
            String concat="";
            AirPutih ap = new AirPutih("Air Putih Hangat");
            ap.setJenisSuhu(40);
            ap.setWarna("Bening");
            concat+=ap.toString()+"\n";

            JusMelon jm = new JusMelon("Jus Melon Dingin");
            jm.setJenisSuhu(10);
            jm.setWarna("Hijau");
            concat+=jm.toString()+"\n";

            SirupStrawberry ss = new SirupStrawberry("Sirup Strawberry Panas");
            ss.setJenisSuhu(40);
            ss.setWarna("Merah");
            concat+=ss.toString();

            editTextPrintOut.setText(concat);
        } else {
            //Toast.makeText(getApplicationContext(),"ol",Toast.LENGTH_LONG).show();
            String concat="";
            Minuman ap2 = new AirPutih("Air Putih Panas");
            ap2.setProperties("Panas", "Bening");
            concat+=ap2.toString()+"\n";

            Minuman jm2 = new JusMelon("Jus Melon Sedang");
            jm2.setProperties("Sedang", "Hijau Muda");
            concat+=jm2.toString()+"\n";

            Minuman ss2 = new SirupStrawberry("Sirup Strawberry Dingin");
            ss2.setProperties("Dingin", "Merah");
            concat+=ss2.toString();

            editTextPrintOut.setText(concat);
        }
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


}
