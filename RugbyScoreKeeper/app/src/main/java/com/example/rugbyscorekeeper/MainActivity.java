package com.example.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore=0;
    private int teamBScore=0;
    private int teamAPenaltyCount=0;
    private int teamBPenaltyCount=0;
    final int threePoints =3;
    final int twoPoints =2;
    final int fivePoints =5;
    final int onePoint = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void resetBothTeams(View v)
    {
            resetTeamA(v);
            resetTeamB(v);
    }


    public void resetTeamA(View v)
    {
        teamAScore=0;
        teamAPenaltyCount= 0;
        displayForTeamA(teamAScore);
        displayPenaltyForTeamA(teamAPenaltyCount);
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
        teamBPenaltyCount+=onePoint;
        displayForTeamA(teamAScore);
        displayPenaltyForTeamB(teamBPenaltyCount);
    }

    public void addFivePointsTeamA(View v)
    {
        teamAScore+=fivePoints;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAPenaltyCount);
        scoreView.setText(String.valueOf(score));
    }


    public void resetTeamB(View v)
    {
        teamBScore=0;
        teamBPenaltyCount=0;
        displayForTeamB(teamBScore);
        displayPenaltyForTeamB(teamBPenaltyCount);
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
        teamAPenaltyCount+=onePoint;
        displayForTeamB(teamBScore);
        displayPenaltyForTeamA(teamAPenaltyCount);
    }

    public void addFivePointsTeamB(View v)
    {
        teamBScore+=fivePoints;
        displayForTeamB(teamBScore);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBPenaltyCount);
        scoreView.setText(String.valueOf(score));
    }


}


