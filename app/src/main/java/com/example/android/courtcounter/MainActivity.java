package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textvw = new TextView(this);
        textvw.setText("WELCOME");
        textvw.setTextSize(66);
        setContentView(textvw);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    int iScoreA = 0;
    int iScoreB = 0;

    public void addAsso(View v) {
        switch (v.getId()) {
            case R.id.asso_A:
                iScoreA += 11;
                displayForTeamA(iScoreA);
                break;
            case R.id.asso_b:
                iScoreB += 11;
                displayForTeamB(iScoreB);
                break;
        }
    }

    public void addTre(View v) {
        switch (v.getId()) {
            case R.id.TRE_A:
                iScoreA += 10;
                displayForTeamA(iScoreA);
                break;
            case R.id.TRE_B:
                iScoreB += 10;
                displayForTeamB(iScoreB);
                break;
        }
    }

    public void AddRe(View v) {
        switch (v.getId()) {
            case R.id.RE_A:
                iScoreA+=4;
                displayForTeamA(iScoreA);
                break;
            case R.id.RE_B:
                iScoreB+=4;
                displayForTeamB(iScoreB);
                break;
        }
    }
    public void AddRegina(View v) {
        switch (v.getId()) {
            case R.id.Regina:
                iScoreA+=3;
                displayForTeamA(iScoreA);
                break;
            case R.id.Reginab:
                iScoreB+=3;
                displayForTeamB(iScoreB);
                break;
        }
    }
    public void AddFante(View v) {
        switch (v.getId()) {
            case R.id.Fante:
                iScoreA+=2;
                displayForTeamA(iScoreA);
                break;
            case R.id.Fanteb:
                iScoreB+=2;
                displayForTeamB(iScoreB);
                break;
        }
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Reset(View v) {
        iScoreA = 0;
        iScoreB = 0;
        displayForTeamA(iScoreA);
        displayForTeamB(iScoreB);
    }

}
