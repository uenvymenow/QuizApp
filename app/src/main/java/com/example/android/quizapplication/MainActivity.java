package com.example.android.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalQuestions = 5;
    int correctAnswers = 0;
    int radioButton1Score = 0;
    int radioButton2Score = 0;
    int radioButton3Score = 0;
    int radioButton4Score = 0;
    int radioButton5Score = 0;

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
                    radioButton1Score = 1;
                break;
            case R.id.questionOneIncorrect:
                if (questionOneIncorrectRB.isChecked()) {
                    radioButton1Score = 0;
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
                    radioButton2Score = 1;
                break;
            case R.id.questionTwoIncorrect:
                if (questionTwoIncorrectRB.isChecked()) {
                    radioButton2Score = 0;
                    break;
                }
        }
    }

    // Checks the radioButton answers for question 3
    public void question3RadioButton(View view) {
        // Import radio buttons for question 3
        RadioButton questionThreeCorrectRB = findViewById(R.id.questionThreeCorrect);
        RadioButton questionThreeIncorrectRB = findViewById(R.id.questionThreeIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionThreeCorrect:
                if (questionThreeCorrectRB.isChecked())
                    radioButton3Score = 1;
                break;
            case R.id.questionThreeIncorrect:
                if (questionThreeIncorrectRB.isChecked()) {
                    radioButton3Score = 0;
                    break;
                }
        }
    }

    // Checks the radioButton answers for question 4
    public void question4RadioButton(View view) {
        // Import radio buttons for question 4
        RadioButton questionFourCorrectRB = findViewById(R.id.questionFourCorrect);
        RadioButton questionFourIncorrectRB = findViewById(R.id.questionFourIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionFourCorrect:
                if (questionFourCorrectRB.isChecked())
                    radioButton4Score = 1;
                break;
            case R.id.questionFourIncorrect:
                if (questionFourIncorrectRB.isChecked()) {
                    radioButton4Score = 0;
                    break;
                }
        }
    }

        // Checks the radioButton answers for question 5
    public void question5RadioButton(View view) {
        // Import radio buttons for question 5
        RadioButton questionFiveCorrectRB = findViewById(R.id.questionFiveCorrect);
        RadioButton questionFiveIncorrectRB = findViewById(R.id.questionFiveIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionFiveCorrect:
                if (questionFiveCorrectRB.isChecked())
                    radioButton5Score = 1;
                break;
            case R.id.questionFiveIncorrect:
                if (questionFiveIncorrectRB.isChecked()) {
                    radioButton5Score = 0;
                    break;
                }
        }
    }

    public int calculateCorrectAnswers(){
        correctAnswers = (radioButton1Score + radioButton2Score + radioButton3Score + radioButton4Score + radioButton5Score);
        return correctAnswers;
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
        Toast.makeText(this, "Your final score is " + calculateFinalScore(calculateCorrectAnswers(), totalQuestions) + "%", Toast.LENGTH_SHORT).show();
    }

    /**
     * Called from the onClick for the submit_answers_button in activity_main.xml
     * Clears the radioButtons and resets the correctAnswers variable to 0 when the Reset button is pressed
     */
    public void resetScores(View view) {
        // Clears Question 1 radioButtons
        RadioButton questionOneCorrectRB = findViewById(R.id.questionOneCorrect);
        RadioButton questionOneIncorrectRB = findViewById(R.id.questionOneIncorrect);
        questionOneCorrectRB.setChecked(false);
        questionOneIncorrectRB.setChecked(false);

        // Clears question 2 radioButtons
        RadioButton questionTwoCorrectRB = findViewById(R.id.questionTwoCorrect);
        RadioButton questionTwoIncorrectRB = findViewById(R.id.questionTwoIncorrect);
        questionTwoCorrectRB.setChecked(false);
        questionTwoIncorrectRB.setChecked(false);

        // Clears question 3 radioButtons
        RadioButton questionThreeCorrectRB = findViewById(R.id.questionThreeCorrect);
        RadioButton questionThreeIncorrectRB = findViewById(R.id.questionThreeIncorrect);
        questionThreeCorrectRB.setChecked(false);
        questionThreeIncorrectRB.setChecked(false);

        // Clears question 4 radioButtons
        RadioButton questionFourCorrectRB = findViewById(R.id.questionFourCorrect);
        RadioButton questionFourIncorrectRB = findViewById(R.id.questionFourIncorrect);
        questionFourCorrectRB.setChecked(false);
        questionFourIncorrectRB.setChecked(false);

        // Clears question 5 radioButtons
        RadioButton questionFiveCorrectRB = findViewById(R.id.questionFiveCorrect);
        RadioButton questionFiveIncorrectRB = findViewById(R.id.questionFiveIncorrect);
        questionFiveCorrectRB.setChecked(false);
        questionFiveIncorrectRB.setChecked(false);

        correctAnswers = 0;
    }

}