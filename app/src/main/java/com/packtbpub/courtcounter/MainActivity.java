package com.packtbpub.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA =0;
    int scoreB = 0;
   // TextView showScoreA;
    Button addOneA, addTwoA, addThreeA,addOneB, addTwoB, addThreeB;

    private final static String BUNDLE_KEY_A
            = " com.example.android.courtcounter.team_a";
    private final static String BUNDLE_KEY_B
            = " com.example.android.courtcounter.team_b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null && savedInstanceState.containsKey(BUNDLE_KEY_A)
                && savedInstanceState.containsKey(BUNDLE_KEY_B)) {
            scoreA = savedInstanceState.getInt(BUNDLE_KEY_A);
            scoreB = savedInstanceState.getInt(BUNDLE_KEY_B);
        }
        showScoreA(scoreA);
        showScoreB(scoreB);

        addOneA = (Button)findViewById(R.id.AonePt);
        addTwoA = (Button)findViewById(R.id.AtwoPt);
        addThreeA = (Button)findViewById(R.id.AthreePt);

        addOneB = (Button)findViewById(R.id.BonePt);
        addTwoB = (Button)findViewById(R.id.BtwoPt);
        addThreeB = (Button)findViewById(R.id.BthreePt);

        addOneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(BUNDLE_KEY_A, scoreA);
        bundle.putInt(BUNDLE_KEY_B, scoreB);
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
}
