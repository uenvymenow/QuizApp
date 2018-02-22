package com.example.android.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalQuestions = 2;
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // called from the onClick for the submit_answers_button in activity_main.xml
    public void submitAnswers(View view) {
        // Calls the display method
        displayMessage();
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

    public void question2RadioButton(View view) {
        // Import radio buttons for question 1
        RadioButton questionTwoCorrectRB = findViewById(R.id.questionTwoCorrect);
        RadioButton questionTwoIncorrectRB = findViewById(R.id.questionTwoIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionTwoCorrect:
                if (questionTwoCorrectRB.isChecked())
                    correctAnswers += 1;
                break;
            case R.id.questionTwoIncorrect:
                if (questionTwoIncorrectRB.isChecked()) {
                    break;
                }
        }
    }

    public int calculateFinalScore(int answersCorrect, int questionTotal) {
        int percentCorrect = (int) (((double) answersCorrect / (double) questionTotal) * 100);
        return percentCorrect;
    }

    public void displayMessage() {
        Toast.makeText(this, "Your final score is " + calculateFinalScore(correctAnswers, totalQuestions) + "%", Toast.LENGTH_SHORT).show();
    }

    public void resetScores(View view) {
        correctAnswers = 0;

        radioGroup1Clear();

        RadioButton questionOneIncorrectRB = findViewById(R.id.questionOneIncorrect);
        RadioButton questionTwoCorrectRB = findViewById(R.id.questionTwoCorrect);
        RadioButton questionTwoIncorrectRB = findViewById(R.id.questionTwoIncorrect);
        questionOneIncorrectRB.setChecked(false);
        questionTwoCorrectRB.setChecked(false);
        questionTwoIncorrectRB.setChecked(false);
    }

    public void radioGroup1Clear(View view){
        RadioButton radioGroupOneClear = findViewById(R.id.radioGroup1);
        radioGroupOneClear.clearCheck();
    }
}