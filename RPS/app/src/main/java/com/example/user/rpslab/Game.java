package com.example.user.rpslab;

import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 21/03/2018.
 */

public class Game {
    private Choice[] choices;
    private HashMap<Choice, Choice> comparables;
    private Result result;
    private Choice compAnswer;

    public Game(){
        this.comparables = new HashMap<>();
        this.comparables.put(Choice.PAPER, Choice.SCISSOR);
        this.comparables.put(Choice.ROCK, Choice.PAPER);
        this.comparables.put(Choice.SCISSOR, Choice.ROCK);

        this.choices = Choice.values();
    }

    public Choice ComputerAnswer(){
        int idx = new Random().nextInt(choices.length);
        Choice answer = (choices[idx]);
        return compAnswer = answer;
    }

    public Result checkAnswer(Choice playerAnswer) {
        if (comparables.get(playerAnswer) == compAnswer) {
            return Result.LOSE;
        } else if (comparables.get(compAnswer) == playerAnswer) {
            return Result.WIN;
        }
        return Result.DRAW;
    }


    public Result play(Choice playerAnswer){
        ComputerAnswer();
        Result result = checkAnswer(playerAnswer);
        return result;
    }
}
