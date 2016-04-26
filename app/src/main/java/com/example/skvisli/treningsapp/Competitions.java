package com.example.skvisli.treningsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Competitions extends AppCompatActivity {
    TextView head;
    ImageButton dArrow;
    ImageButton accept;
    ImageButton x;
    ImageView byOpen;
    ImageView byClosed;
    ImageView bypameldt;
    ImageView pokal1;
    ImageView pokal2;
    LinearLayout linyes;
    LinearLayout linnot;

    private ImageButton hjem;
    private ImageButton skritt;
    private ImageButton resultat;
    private ImageButton profil;
    private ImageButton instilling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions);

        hjem = (ImageButton) findViewById(R.id.hjem);
        skritt = (ImageButton) findViewById(R.id.skritt);
        resultat = (ImageButton) findViewById(R.id.resultat);
        profil = (ImageButton) findViewById(R.id.profil);
        instilling = (ImageButton) findViewById(R.id.instilling);
        head = (TextView) findViewById(R.id.headline);
        dArrow = (ImageButton)findViewById(R.id.downArrow);
        accept = (ImageButton)findViewById(R.id.acceptButton);
        x = (ImageButton)findViewById(R.id.avmeld);
        byOpen = (ImageView) findViewById(R.id.byasenOpen);
        byClosed = (ImageView) findViewById(R.id.byasenClosed);
        bypameldt= (ImageView) findViewById(R.id.byasenrundtpameldt);
        pokal1 = (ImageView) findViewById(R.id.pokal1);
        pokal2 = (ImageView) findViewById(R.id.pokal2);
        linyes = (LinearLayout) findViewById(R.id.layoutYes);
        linnot = (LinearLayout) findViewById(R.id.layoutNot);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_competitions, menu);
        return true;
    }

    public void goTo(View view){
        if(hjem.isPressed()){
            startActivity(new Intent(this, Main.class));
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

    public void clickDownArrow(View view){
        downArrow();
    }

    public void accept(View view){
        linyes.setVisibility(View.VISIBLE);
        linnot.setVisibility(View.INVISIBLE);

    }

    public void meldAv(View view){
        linyes.setVisibility(View.INVISIBLE);
        linnot.setVisibility(View.VISIBLE);
        downArrow();
    }

    public void downArrow(){
        if (byOpen.getVisibility() == View.INVISIBLE){
            byOpen.setVisibility(View.VISIBLE);
            accept.setVisibility(View.VISIBLE);
            byClosed.setVisibility(View.INVISIBLE);
            dArrow.setRotation(180);
        }else{
            byOpen.setVisibility(View.INVISIBLE);
            accept.setVisibility(View.INVISIBLE);
            byClosed.setVisibility(View.VISIBLE);
            dArrow.setRotation(0);
        }
    }
}
