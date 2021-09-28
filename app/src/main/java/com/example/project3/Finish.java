package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Finish extends AppCompatActivity {
    int highScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish2);

        Intent mainActivity = getIntent();
        int currentScore = mainActivity.getIntExtra("CurrentScore", 0);
        TextView yourScore = findViewById(R.id.yourScore);
        yourScore.setText("Your Score: " + currentScore*10 + "%");

        if(currentScore > highScore){
            highScore = currentScore;
        }
        TextView displayHighScore = findViewById(R.id.highScore);
        displayHighScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayHighScore.setText("High Score: " + highScore*10 + "%");
            }
        });

        Button restart = findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureNextButton();
            }
        });

    }

    private void configureNextButton(){
        Button nextButton = findViewById(R.id.nextQuestion);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Finish.this, MainActivity.class));
            }
        });
    }

}