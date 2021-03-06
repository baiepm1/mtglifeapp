package com.dopemz.magiclife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class player2 extends AppCompatActivity {
    private Button player1btn;
    private Button player3btn;
    private Button player4btn;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

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
        player1btn = (Button) findViewById(R.id.act1btn);
        player1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
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



    }


    //--------functions to get to other activities
    public void openActivity1(){
        Intent intent = new Intent(this, player1.class);
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
