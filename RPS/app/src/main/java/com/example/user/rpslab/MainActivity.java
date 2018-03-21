package com.example.user.rpslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartButtonClicked(View button){
        Log.d(getClass().toString(), "onStartButtonClicked");
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
