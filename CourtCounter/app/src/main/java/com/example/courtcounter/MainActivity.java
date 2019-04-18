package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
private int teamAScore=0;
private int teamBScore=0;
final int threePoints =3;
final int twoPoints =2;
final int onePoint =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void resetPointsTeamA(View v)
    {
        teamAScore=0;
        displayForTeamA(teamAScore);
    }

    public void addOnePointTeamA(View v)
    {
        teamAScore+=onePoint;
        displayForTeamA(teamAScore);
    }

    public void addTwoPointsTeamA(View v)
    {
        teamAScore+=twoPoints;
        displayForTeamA(teamAScore);
    }

    public void addThreePointsTeamA(View v)
    {
        teamAScore+=threePoints;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void resetPointsTeamB(View v)
    {
        teamBScore=0;
        displayForTeamB(teamBScore);
    }

    public void addOnePointTeamB(View v)
    {
        teamBScore+=onePoint;
        displayForTeamB(teamBScore);
    }

    public void addTwoPointsTeamB(View v)
    {
        teamBScore+=twoPoints;
        displayForTeamB(teamBScore);
    }

    public void addThreePointsTeamB(View v)
    {
        teamBScore+=threePoints;
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }
}
