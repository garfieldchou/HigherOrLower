package com.garfieldchou.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int numToGuess;

    public void makeToast (String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();
    }

    public void numGuess (View view) {
        Log.i("Info", "Guess button was clicked !");
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());
        Log.i("Info", "guess number: " + guessInt);

        if ( guessInt == numToGuess) {
            makeToast("Hit!");
            Random r = new Random();
            numToGuess = r.nextInt(20) + 1 ;
            Log.i("Info", "new number to guess: " + numToGuess) ;
        } else if ( guessInt > numToGuess ) {
            makeToast("Higher, try a lower one !");
        } else {
            makeToast("Lower, try a higher one !");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        numToGuess = r.nextInt(20) + 1 ;
        Log.i("Info", "number to guess: " + numToGuess) ;
    }
}
