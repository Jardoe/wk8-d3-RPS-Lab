package com.example.user.rpslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game = new Game();

        Intent intent = getIntent();

    }



    public void onRockButtonClicked(View button){
        Log.d(getClass().toString(), "onRockButtonClicked was called");
        game.play(Choice.ROCK);
        initializeIntent(Choice.ROCK);

    }

    public void onPaperButtonClicked(View button){
        Log.d(getClass().toString(), "onPaperButtonClicked was called");
        game.play(Choice.PAPER);
        initializeIntent(Choice.PAPER);
    }

    public void onScissorsButtonClicked(View button){
        Log.d(getClass().toString(), "onScissorsButtonClicked");
        game.play(Choice.SCISSOR);
        initializeIntent(Choice.SCISSOR);
    }

    public void initializeIntent(Choice playerAnswer){
        Intent resultActivityIntent = new Intent(this, ResultsActivity.class);
        resultActivityIntent.putExtra("playerAnswer", playerAnswer);
        resultActivityIntent.putExtra("computerAnswer", game.ComputerAnswer() );
        resultActivityIntent.putExtra("result", game.checkAnswer(playerAnswer));
        startActivity(resultActivityIntent);

    }
}
