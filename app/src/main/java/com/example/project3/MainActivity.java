package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int questionCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.nextQuestion);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionCount++;

                TextView questionNumber = findViewById(R.id.questionNumber);
                questionNumber.setText("Question " + questionCount);

                if(questionCount == 10){
                    next.setText("Submit");
                }
                updateQuestion();

            }
        });
    }

    private void updateQuestion(){
        ImageView question = findViewById(R.id.question);

        if(questionCount == 2){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q2));
        }
        else if(questionCount == 3){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q3));
        }
        else if(questionCount == 4){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q4));
        }
        else if(questionCount == 5){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q5));
        }
        else if(questionCount == 6){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q6));
        }
        else if(questionCount == 7){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q7));
        }
        else if(questionCount == 8){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q8));
        }
        else if(questionCount == 9){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q9));
        }
        else if(questionCount == 10){
            question.setImageDrawable(getDrawable(R.drawable.project_3_quiz_q10));
        }

    }

}