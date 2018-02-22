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

    /**
     * Called from the onClick for the submit_answers_button in activity_main.xml
     *
     * calls the displayMessage method to display the Toast message
     */
    public void submitAnswers(View view) {
        // Calls the display method
        displayMessage();
    }

    // Checks the radioButton answers for question 1
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

    // Checks the radioButton answers for question 2
    public void question2RadioButton(View view) {
        // Import radio buttons for question 2
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

    /**
     * Calculates the final percentage of correct answers
     *
     * The percentCorrect is converted to an integer to cut off any decimals
     *
     * @param answersCorrect passes in the answers correct and converts it to a double as there will be decimals in the final calculation
     * @param questionTotal passes in the total questions and converts it to a double as there will be decimals in the final calculation
     * @return returns the percentage of correct answers
     */
    public int calculateFinalScore(int answersCorrect, int questionTotal) {
        int percentCorrect = (int) (((double) answersCorrect / (double) questionTotal) * 100);
        return percentCorrect;
    }

    // method to display the Toast of the final score percentage
    public void displayMessage() {
        Toast.makeText(this, "Your final score is " + calculateFinalScore(correctAnswers, totalQuestions) + "%", Toast.LENGTH_SHORT).show();
    }

    /**
     * Called from the onClick for the submit_answers_button in activity_main.xml
     * Clears the radioButtons and resets the correctAnswers variable to 0 when the Reset button is pressed
     */
    public void resetScores(View view) {
        RadioButton questionOneCorrectRB = findViewById(R.id.questionOneCorrect);
        RadioButton questionOneIncorrectRB = findViewById(R.id.questionOneIncorrect);
        RadioButton questionTwoCorrectRB = findViewById(R.id.questionTwoCorrect);
        RadioButton questionTwoIncorrectRB = findViewById(R.id.questionTwoIncorrect);
        questionOneCorrectRB.setChecked(false);
        questionOneIncorrectRB.setChecked(false);
        questionTwoCorrectRB.setChecked(false);
        questionTwoIncorrectRB.setChecked(false);

        correctAnswers = 0;
    }

}