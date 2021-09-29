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
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_finish2);

        // Supposed to maintain high score but not working
        if (bundle!= null){
            highScore = bundle.getInt("highscore");
        }

        Intent mainActivity = getIntent();
        int currentScore = mainActivity.getIntExtra("CurrentScore", 0);
        TextView yourScore = findViewById(R.id.yourScore);
        yourScore.setText("Your Score: " + currentScore*10 + "%");

        TextView displayHighScore = findViewById(R.id.highScore);

        if(currentScore > highScore){
            highScore = currentScore;
            displayHighScore.setText("High Score: " + highScore*10 + "%");
        }

        Button restart = findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //configureNextButton();
                startActivity(new Intent(Finish.this, MainActivity.class));
            }
        });

    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("highscore", highScore);
    }
}