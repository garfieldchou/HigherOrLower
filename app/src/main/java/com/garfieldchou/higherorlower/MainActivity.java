package com.garfieldchou.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public void numGuess (View view) {
        Log.i("Info", "Guess button was clicked !");
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        Log.i("Info", "guess number: " + guessEditText.getText().toString());
        Random r = new Random();
        int numToGuess = r.nextInt(20 - 1) + 1 ;
        Log.i("Info", "number to guess: " + numToGuess) ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
