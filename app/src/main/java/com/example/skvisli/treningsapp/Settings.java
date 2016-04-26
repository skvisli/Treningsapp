package com.example.skvisli.treningsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.ImageView;

import android.widget.ImageButton;


public class Settings extends AppCompatActivity {

    private ImageButton hjem;
    private ImageButton konkurranse;
    private ImageButton skritt;
    private ImageButton resultat;
    private ImageButton profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        hjem = (ImageButton) findViewById(R.id.hjem);
        konkurranse = (ImageButton) findViewById(R.id.konkurranse);
        skritt = (ImageButton) findViewById(R.id.skritt);
        resultat = (ImageButton) findViewById(R.id.resultat);
        profil = (ImageButton) findViewById(R.id.profil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        return true;
    }

    public void goTo(View view){
        if(hjem.isPressed()){
            startActivity(new Intent(this, Main.class));
        }
        if(konkurranse.isPressed()){
            startActivity(new Intent(this, Competitions.class));
        }
        if(skritt.isPressed()){
            startActivity(new Intent(this, Steps.class));
        }
        if(resultat.isPressed()){
            startActivity(new Intent(this, Results.class));
        }
        if(profil.isPressed()){
            startActivity(new Intent(this, Profile.class));
        }
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
