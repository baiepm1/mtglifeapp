package com.dopemz.magiclife;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class playerStuff{

    private int lifeTotal;
    private TextView lifetext;
    private Button up, down;

    private String color;
    private String bgIcon;

    public playerStuff(TextView text, int startLife){       //constructor
        lifetext = text;
        lifeTotal = startLife;
        lifetext.setText(Integer.toString(lifeTotal));
    }

    public playerStuff(){                                   //default constructor
        lifeTotal = 20;
        lifetext.setText(Integer.toString(lifeTotal));
    }

    public void reset(int startLife){
        lifeTotal = startLife;
        lifetext.setText(Integer.toString(lifeTotal));
    }

    public void gain(){
        lifeTotal = lifeTotal + 1;
        lifetext.setText(Integer.toString(lifeTotal));
    }


    public void lose(){
        lifeTotal = lifeTotal - 1;
        lifetext.setText(Integer.toString(lifeTotal));
    }
}
