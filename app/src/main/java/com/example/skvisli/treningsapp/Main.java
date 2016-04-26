package com.example.skvisli.treningsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {

    private ImageButton konkurranse;
    private ImageButton skritt;
    private ImageButton resultat;
    private ImageButton profil;
    private ImageButton instilling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        konkurranse = (ImageButton) findViewById(R.id.konkurranse);
        skritt = (ImageButton) findViewById(R.id.skritt);
        resultat = (ImageButton) findViewById(R.id.resultat);
        profil = (ImageButton) findViewById(R.id.profil);
        instilling = (ImageButton) findViewById(R.id.instilling);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void goTo(View view){
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
        if(instilling.isPressed()){
            startActivity(new Intent(this, Settings.class));
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
}
