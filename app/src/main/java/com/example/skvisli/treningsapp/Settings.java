package com.example.skvisli.treningsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
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

    public void clickVarOn(View view){
        ImageView imageOn = (ImageView) findViewById(R.id.varOn);
        ImageView imageOff = (ImageView) findViewById(R.id.varOff);

        imageOn.setVisibility(View.INVISIBLE);
        imageOff.setVisibility(View.VISIBLE);
    }

    public void clickVarOff(View view){
        ImageView imageOn = (ImageView) findViewById(R.id.varOn);
        ImageView imageOff = (ImageView) findViewById(R.id.varOff);

        imageOn.setVisibility(View.VISIBLE);
        imageOff.setVisibility(View.INVISIBLE);
    }

    public void clickTroOn(View view){
        ImageView troOn = (ImageView) findViewById(R.id.troOn);
        ImageView troOff = (ImageView) findViewById(R.id.troOff);

        troOn.setVisibility(View.INVISIBLE);
        troOff.setVisibility(View.VISIBLE);
    }

    public void clickTroOff(View view){
        ImageView troOn = (ImageView) findViewById(R.id.troOn);
        ImageView troOff = (ImageView) findViewById(R.id.troOff);

        troOn.setVisibility(View.VISIBLE);
        troOff.setVisibility(View.INVISIBLE);
    }
}
