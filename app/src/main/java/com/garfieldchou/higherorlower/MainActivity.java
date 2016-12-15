package com.garfieldchou.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public int numToGuess;

    public void numGuess (View view) {
        Log.i("Info", "Guess button was clicked !");
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());
        Log.i("Info", "guess number: " + guessInt);

        if ( guessInt == numToGuess) {
            Toast.makeText(MainActivity.this, "Hit!", Toast.LENGTH_LONG).show();
        } else if ( guessInt > numToGuess ) {
            Toast.makeText(MainActivity.this, "Higher, try a lower one !", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "Lower, try a higher one !", Toast.LENGTH_LONG).show();
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
