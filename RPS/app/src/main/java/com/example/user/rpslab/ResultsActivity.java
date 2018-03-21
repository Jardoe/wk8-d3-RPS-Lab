package com.example.user.rpslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        Choice playerAnswer1 = (Choice) extras.get("playerAnswer");
        Choice computerAnswer1 = (Choice) extras.get("computerAnswer");
        Result result1 = (Result) extras.get("result");

        TextView playerAnswer = findViewById(R.id.player_answer);
        playerAnswer.setText("You chose: " + playerAnswer1.toString().toLowerCase());

        TextView computerAnswer = findViewById(R.id.computer_answer);
        computerAnswer.setText("The computer chose: " + computerAnswer1.toString().toLowerCase());

        TextView result = findViewById(R.id.result);
        result.setText("You " + result1.toString().toLowerCase() + "!");
    }


}
