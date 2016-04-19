package com.example.skvisli.treningsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions);

        head = (TextView) findViewById(R.id.headline);

        dArrow = (ImageButton)findViewById(R.id.downArrow);
        accept = (ImageButton)findViewById(R.id.acceptButton);
        x = (ImageButton)findViewById(R.id.avmeld);
        byOpen = (ImageView) findViewById(R.id.byasenOpen);
        byClosed = (ImageView) findViewById(R.id.byasenClosed);
        bypameldt= (ImageView) findViewById(R.id.byasenrundtpameldt);
        pokal1= (ImageView) findViewById(R.id.pokal1);
        pokal2= (ImageView) findViewById(R.id.pokal2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_competitions, menu);
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

    public void clickDownArrow(View view){
        downArrow();
    }

    public void accept(View view){
        downArrow();
        byClosed.setVisibility(View.INVISIBLE);
        bypameldt.setVisibility(View.VISIBLE);
        accept.setVisibility(View.INVISIBLE);
        x.setVisibility(View.VISIBLE);
        accept.setVisibility(View.INVISIBLE);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_BOTTOM, RelativeLayout.TRUE);
        head.setLayoutParams(params);

    }

    public void meldAV(View view){
        bypameldt.setVisibility(View.INVISIBLE);
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
