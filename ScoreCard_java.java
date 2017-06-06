package com.example.shivani.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dispA(0);
        dispB(0);
    }
    public void dispA(int score)
    {
        TextView scoreView=(TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(score));
    }
    public void dispB(int score)
    {
        TextView scoreView=(TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(score));
    }
    public void add3A(View view)
    {
        scoreA=scoreA+3;
        dispA(scoreA);
    }
    public void add2A(View view)
    {
        scoreA=scoreA+2;
        dispA(scoreA);
    }
    public void add1A(View view)
    {
        scoreA=scoreA+1;
        dispA(scoreA);
    }
    public void add3B(View view)
    {
        scoreB=scoreB+3;
        dispB(scoreB);
    }
    public void add2B(View view)
    {
        scoreB=scoreB+2;
        dispB(scoreB);
    }
    public void add1B(View view)
    {
        scoreB=scoreB+1;
        dispB(scoreB);
    }
    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        dispA(scoreA);
        dispB(scoreB);
    }
}
