package com.example.android.quizapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalQuestions = 10;
    int correctAnswers = 0;
    int question1Score = 0;
    int question2Score = 0;
    int question3Score = 0;
    int question4Score = 0;
    int question5Score = 0;
    int question6Score = 0;
    int question7Score = 0;
    int question8Score = 0;
    int question9Score = 0;
    int question10Score = 0;

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

        // Check if correct RadioButton is clicked
        if (questionOneCorrectRB.isChecked()) {
            question1Score = 1;
        } else {
            question1Score = 0;
        }
    }

    // Checks the radioButton answers for question 2
    public void question2RadioButton(View view) {
        // Import correct radio button for question 2
        RadioButton questionTwoCorrectRB = findViewById(R.id.questionTwoCorrect);

        // Check if correct RadioButton was clicked
        if (questionTwoCorrectRB.isChecked()) {
            question2Score = 1;
        } else {
            question2Score = 0;
        }
    }

    // Checks the EditText answers for question 3
    public int question3EditTextView() {
        // Import radio buttons for question 3
        EditText questionThreeEditText = findViewById(R.id.question3EditText);

        // Creates a string variable to hold the text entered into
        String questionThreeAnswer = questionThreeEditText.getText().toString();
        questionThreeAnswer = questionThreeAnswer.toLowerCase();


        // Checks if answer is correct and if so, adds 1 to correct answer, otherwise it stays as 0 for correct answer
        if ((questionThreeAnswer.equals("second base")) || (questionThreeAnswer.equals("second"))) {
            question3Score = 1;
        } else {
            question3Score = 0;
        }

        return question3Score;
    }

    // Checks the radioButton answers for question 4
    public void question4CheckBox(View view) {
        // Import correct checkboxes for question 4
        CheckBox questionFourCorrectCB1 = findViewById(R.id.questionFourCorrect1);
        CheckBox questionFourCorrectCB2 = findViewById(R.id.questionFourCorrect2);

        // Check if correct checkbox was clicked
        if ((questionFourCorrectCB1.isChecked()) && (questionFourCorrectCB2.isChecked())){
            question4Score = 1;
        } else {
            question4Score = 0;
        }
    }

    // Checks the radioButton answers for question 5
    public void question5RadioButton(View view) {
        // Import correct radio buttons for question 5
        RadioButton questionFiveCorrectRB = findViewById(R.id.questionFiveCorrect);

        // Check if correct radio button was clicked
        if (questionFiveCorrectRB.isChecked()){
            question5Score = 1;
        } else {
            question5Score = 0;
        }
    }

    // Checks the radioButton answers for question 6
    public void question6RadioButton(View view) {
        // Import radio buttons for question 6
        RadioButton questionSixCorrectRB = findViewById(R.id.questionSixCorrect);

        // Check if correct radio button was clicked
        if (questionSixCorrectRB.isChecked()){
            question6Score = 1;
        } else {
            question6Score = 0;
        }
    }

    // Checks the radioButton answers for question 7
    public void question7CheckBox(View view) {
        // Import radio buttons for question 7
        CheckBox questionSevenCorrectCB1 = findViewById(R.id.question7Correct1);
        CheckBox questionSevenCorrectCB2 = findViewById(R.id.question7Correct2);
        CheckBox questionSevenCorrectCB3 = findViewById(R.id.question7Correct3);

        // Check if correct checkbox was clicked button was clicked
        if ((questionSevenCorrectCB1.isChecked()) && (questionSevenCorrectCB2.isChecked()) && (questionSevenCorrectCB3.isChecked())){
            question7Score = 1;
        } else {
            question7Score = 0;
        }
    }

    // Checks the radioButton answers for question 8
    public int question8EditText() {
        // Import radio buttons for question 8
        EditText questionEightCorrect = findViewById(R.id.question8Answer);

        String question8AnswerString = questionEightCorrect.getText().toString();

        // Check if input is 30
        if (question8AnswerString.equals("30")){
            question8Score = 1;
        } else {
            question8Score = 0;
        }

        return question8Score;
    }

    // Checks the radioButton answers for question 9
    public void question9RadioButton(View view) {
        // Import radio buttons for question 9
        RadioButton questionNineCorrectRB = findViewById(R.id.questionNineCorrect);

        // Check if correct radio button was clicked
        if (questionNineCorrectRB.isChecked()){
            question9Score = 1;
        } else {
            question9Score = 0;
        }
    }

    // Checks the radioButton answers for question 10
    public void question10RadioButton(View view) {
        // Import radio buttons for question 10
        RadioButton questionTenCorrectRB = findViewById(R.id.questionTenCorrect);

        // Check if correct radio button was clicked
        if (questionTenCorrectRB.isChecked()){
            question10Score = 1;
        } else {
            question10Score = 0;
        }
    }

    public int calculateCorrectAnswers(){
        // calls the questionThreeEditTextView method to retrieve the score for question 3
        question3Score = question3EditTextView();
        question8Score = question8EditText();

        // Adds all of the correct answers
        correctAnswers = (question1Score + question2Score + question3Score + question4Score + question5Score + question6Score + question7Score +
                            question8Score + question9Score + question10Score);
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
        Intent resetApp = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
        resetApp.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(resetApp);
    }

}