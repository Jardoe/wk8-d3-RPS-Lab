package com.example.user.rpslab;

import android.support.v4.widget.TextViewCompat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21/03/2018.
 */
public class GameTest {

    Choice choice;
    Choice[] choices;

    @Before
    public void before(){
        choices = Choice.values();
    }

    @Test
    public void choiceArrayHasThreeChoices(){
        assertEquals(3, choices.length );
    }

}