package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        Button submit = (Button) findViewById(R.id.Submit);
        final   RadioButton question1 = (RadioButton) findViewById(R.id.Q1O2);
        final  CheckBox question2a = (CheckBox) findViewById(R.id.Q2O2);
        final   CheckBox question2b = (CheckBox) findViewById(R.id.Q2O4);
        final  CheckBox question2c = (CheckBox) findViewById(R.id.Q2O1);
        final   CheckBox question2d= (CheckBox) findViewById(R.id.Q2O3);
        final   EditText question3= (EditText) findViewById(R.id.Q3Answer);
        final  RadioButton question4 = (RadioButton) findViewById(R.id.Q4O6);


        // Set a click listener on that View
        submit.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                int score =0;
              score = CalculatedScore(question1.isChecked(),question2a.isChecked(),question2b.isChecked(),question2c.isChecked(),question2d.isChecked(), question3.getText().toString(),question4.isChecked());
                Toast.makeText(getApplicationContext(),"Your SCORE is " + score + " out of 4", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public int CalculatedScore(boolean question1,boolean question2a,boolean question2b,boolean question2c,boolean question2d,String question3,boolean question4)
    {
        int score = 0;

        if (question1 == true)
            score++;

        if (question2a  == true && question2b == true && question2c ==false && question2d ==false)
            score++;

        if (question3.toLowerCase().equals("hexagon"))
            score++;

        if (question4 == true)
            score++;

        return score;
    }
}
