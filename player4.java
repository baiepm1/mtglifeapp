package com.dopemz.magiclife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class player4 extends AppCompatActivity {
    private Button player2btn;
    private Button player3btn;
    private Button player1btn;
View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player4);

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


    }


    //--------functions to get to other activities
    public void openActivity1(){
        Intent intent = new Intent(this, player1.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, player2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, player3.class);
        startActivity(intent);
    }

}
