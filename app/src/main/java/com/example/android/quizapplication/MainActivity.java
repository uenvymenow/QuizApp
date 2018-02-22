package com.example.android.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int percentCorrect = 0;
    int totalQuestions = 1;
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // called from the onClick for the submit_answers_button in activity_main.xml
    public void submitAnswers(View view) {
        // Calls the display method
        displayMessage(percentCorrect);
    }

    public void question1RadioButton(View view) {
        // Import radio buttons for question 1
        RadioButton questionOneCorrectRB = findViewById(R.id.questionOneCorrect);
        RadioButton questionOneIncorrectRB = findViewById(R.id.questionOneIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionOneCorrect:
                if (questionOneCorrectRB.isChecked())
                    correctAnswers += 1;
                break;
            case R.id.questionOneIncorrect:
                if (questionOneIncorrectRB.isChecked()) {
                    break;
                }
        }
    }

    public int calculateFinalScore(int correctAnswers, int totalQuestions) {
        double finalScore = (double) correctAnswers / (double) totalQuestions;
        int percentCorrect = (int) finalScore * 100;
        return percentCorrect;
    }

    public void displayMessage(int finalPercentage) {
        Toast.makeText(this, "Your final score is " + calculateFinalScore(correctAnswers, totalQuestions) + "%", Toast.LENGTH_SHORT).show();
        resetScores();
    }

    public void resetScores() {
        percentCorrect = 0;
        totalQuestions = 1;
        correctAnswers = 0;
    }
}
