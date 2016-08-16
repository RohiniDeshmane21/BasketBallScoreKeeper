package com.packtbpub.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA =0, scoreB = 0;
   // TextView showScoreA;
    Button addOneA, addTwoA, addThreeA,addOneB, addTwoB, addThreeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addOneA = (Button)findViewById(R.id.AonePt);
        addTwoA = (Button)findViewById(R.id.AtwoPt);
        addThreeA = (Button)findViewById(R.id.AthreePt);

        addOneB = (Button)findViewById(R.id.BonePt);
        addTwoB = (Button)findViewById(R.id.BtwoPt);
        addThreeB = (Button)findViewById(R.id.BthreePt);

        addOneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  TextView showScoreA = (TextView)findViewById(R.id.AscoreText);
                scoreA = scoreA +1;
                showScoreA(scoreA);
            }
        });

        addTwoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA + 2;
                showScoreA(scoreA);
            }
        });

        addThreeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA + 3;
                showScoreA(scoreA);
            }
        });

        addOneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB+1;
                showScoreB(scoreB);
            }
        });

        addTwoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB+2;
                showScoreB(scoreB);
            }
        });

        addThreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB + 3;
                showScoreB(scoreB);
            }
        });
        //TextView showScoreA = (TextView)findViewById(R.id.scoreText);
       // showScoreA.setText(score);
    }


    public void showScoreA(int scor)
    {
        TextView showScoreA = (TextView)findViewById(R.id.AscoreText);
        showScoreA.setText(String.valueOf(scor));
    }

    public void showScoreB(int scor)
    {
        TextView showScoreA = (TextView)findViewById(R.id.BscoreText);
        showScoreA.setText(String.valueOf(scor));
    }

    /*
    Reset the score to 0
     */
    public void reset(View view)
    {
        scoreA = 0;
        scoreB = 0;
        showScoreA(scoreA);
        showScoreB(scoreB);
    }

    /*
    add 1 in score if click on free hit button

    private void addOnePtA()
    {
        TextView showScoreA = (TextView)findViewById(R.id.AscoreText);
        //Button addOne = (Button)findViewById(R.id.AonePt);
        score = score+1;
        showScoreA.setText(score);
    }

    /*
    add 2 in score if click on +2 button


    private void addTwoPtA()
    {
        TextView showScoreA = (TextView)findViewById(R.id.AscoreText);
        //Button addOne = (Button)findViewById(R.id.AonePt);
        score = score+2;
        showScoreA.setText(score);
    }

    /*
    add 3 in score if click on +2 button


    private void addThreePtA(View view)
    {
        TextView showScoreA = (TextView)findViewById(R.id.AscoreText);
        //Button addOne = (Button)findViewById(R.id.AonePt);
        score = score+3;
        showScoreA.setText(score);
    }*/

}
