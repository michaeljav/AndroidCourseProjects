package com.example.michaeljaviermota.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.roll_btn);

        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6

        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze Button has been pressed!");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dice", "+================================================== ");
                Log.d("Dice", "The random number is: " + number);
                leftDice.setImageResource(diceArray[number]);

                int number2 = randomNumberGenerator.nextInt(6);
                Log.d("Dice", "The random number2 is: " + number2);

                rightDice.setImageResource(diceArray[number2]);
            }
        });

    }

}
