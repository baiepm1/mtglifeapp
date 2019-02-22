package com.dopemz.magiclife;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class player1 extends AppCompatActivity {
private Button player2btn;
private Button player3btn;
private Button player4btn;
View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//---------------visual activity stuff
        View decorView = getWindow().getDecorView();
        view = this.getWindow().getDecorView();
        //view.setBackgroundResource(R.color.dark);
    // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    // Hide android default action bar
      getSupportActionBar().hide();

//--------------setting up activity buttons
        player2btn = (Button) findViewById(R.id.act2btn);
        player2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        player3btn = (Button) findViewById(R.id.act3btn);
        player3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        player4btn = (Button) findViewById(R.id.act4btn);
        player4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });


//--------------setting up player stuff
        int startinglife = 20;

        Button up1 = (Button) findViewById(R.id.up1);
        Button down1 = (Button) findViewById(R.id.down1);
        TextView life1 = (TextView) findViewById(R.id.life1);



       final playerStuff player1 = new playerStuff(life1, startinglife);
        up1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1.gain();
            }
        });
        down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1.lose();
            }
        });



    }

//--------functions to get to other activities
    public void openActivity2(){
        Intent intent = new Intent(this, player2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, player3.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent = new Intent(this, player4.class);
        startActivity(intent);
    }

}
