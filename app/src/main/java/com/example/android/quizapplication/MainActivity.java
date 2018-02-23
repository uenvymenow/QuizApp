package com.example.android.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalQuestions = 10;
    int correctAnswers = 0;
    int radioButton1Score = 0;
    int checkBox2Score = 0;
    int radioButton3Score = 0;
    int radioButton4Score = 0;
    int radioButton5Score = 0;
    int radioButton6Score = 0;
    int radioButton7Score = 0;
    int radioButton8Score = 0;
    int radioButton9Score = 0;
    int radioButton10Score = 0;

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
    public void question2CheckBox(View view) {
        // Import radio buttons for question 2
        CheckBox questionTwoCorrectRB = findViewById(R.id.questionTwoCorrect);

        // Check which Checkbox button was clicked
                if (questionTwoCorrectRB.isChecked()){
                    checkBox2Score = 1;
                } else {
                    checkBox2Score = 0;
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

    // Checks the radioButton answers for question 6
    public void question6RadioButton(View view) {
        // Import radio buttons for question 6
        RadioButton questionSixCorrectRB = findViewById(R.id.questionSixCorrect);
        RadioButton questionSixIncorrectRB = findViewById(R.id.questionSixIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionSixCorrect:
                if (questionSixCorrectRB.isChecked())
                    radioButton6Score = 1;
                break;
            case R.id.questionSixIncorrect:
                if (questionSixIncorrectRB.isChecked()) {
                    radioButton6Score = 0;
                    break;
                }
        }
    }

    // Checks the radioButton answers for question 7
    public void question7RadioButton(View view) {
        // Import radio buttons for question 7
        RadioButton questionSevenCorrectRB = findViewById(R.id.questionSevenCorrect);
        RadioButton questionSevenIncorrectRB = findViewById(R.id.questionSevenIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionSevenCorrect:
                if (questionSevenCorrectRB.isChecked())
                    radioButton7Score = 1;
                break;
            case R.id.questionSevenIncorrect:
                if (questionSevenIncorrectRB.isChecked()) {
                    radioButton7Score = 0;
                    break;
                }
        }
    }

    // Checks the radioButton answers for question 8
    public void question8RadioButton(View view) {
        // Import radio buttons for question 8
        RadioButton questionEightCorrectRB = findViewById(R.id.questionEightCorrect);
        RadioButton questionEightIncorrectRB = findViewById(R.id.questionEightIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionEightCorrect:
                if (questionEightCorrectRB.isChecked())
                    radioButton8Score = 1;
                break;
            case R.id.questionEightIncorrect:
                if (questionEightIncorrectRB.isChecked()) {
                    radioButton8Score = 0;
                    break;
                }
        }
    }

    // Checks the radioButton answers for question 9
    public void question9RadioButton(View view) {
        // Import radio buttons for question 9
        RadioButton questionNineCorrectRB = findViewById(R.id.questionNineCorrect);
        RadioButton questionNineIncorrectRB = findViewById(R.id.questionNineIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionNineCorrect:
                if (questionNineCorrectRB.isChecked())
                    radioButton9Score = 1;
                break;
            case R.id.questionNineIncorrect:
                if (questionNineIncorrectRB.isChecked()) {
                    radioButton9Score = 0;
                    break;
                }
        }
    }

    // Checks the radioButton answers for question 10
    public void question10RadioButton(View view) {
        // Import radio buttons for question 10
        RadioButton questionTenCorrectRB = findViewById(R.id.questionTenCorrect);
        RadioButton questionTenIncorrectRB = findViewById(R.id.questionTenIncorrect);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionTenCorrect:
                if (questionTenCorrectRB.isChecked())
                    radioButton10Score = 1;
                break;
            case R.id.questionTenIncorrect:
                if (questionTenIncorrectRB.isChecked()) {
                    radioButton10Score = 0;
                    break;
                }
        }
    }

    public int calculateCorrectAnswers(){
        correctAnswers = (radioButton1Score + checkBox2Score + radioButton3Score + radioButton4Score + radioButton5Score + radioButton6Score + radioButton7Score +
                            radioButton8Score + radioButton9Score + radioButton10Score);
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
        RadioGroup questionOneRG = findViewById(R.id.radioGroup1);
        questionOneRG.clearCheck();

        // Clears question 2 checkBoxes
        CheckBox questionTwoCorrectCheckBox = findViewById(R.id.questionTwoCorrect);
        CheckBox questionTwoIncorrectCheckBox = findViewById(R.id.questionTwoIncorrect);
        questionTwoCorrectCheckBox.setChecked(false);
        questionTwoIncorrectCheckBox.setChecked(false);

        // Clears question 3 radioButtons
        RadioGroup questionThreeRG = findViewById(R.id.radioGroup3);
        questionThreeRG.clearCheck();

        // Clears question 4 radioButtons
        RadioGroup questionFourRG = findViewById(R.id.radioGroup4);
        questionFourRG.clearCheck();

        // Clears question 5 radioButtons
        RadioGroup questionFiveRG = findViewById(R.id.radioGroup5);
        questionFiveRG.clearCheck();

        // Clears question 6 radioButtons
        RadioGroup questionSixRG = findViewById(R.id.radioGroup6);
        questionSixRG.clearCheck();

        // Clears question 7 radioButtons
        RadioGroup questionSevenRG = findViewById(R.id.radioGroup7);
        questionSevenRG.clearCheck();

        // Clears question 8 radioButtons
        RadioGroup questionEightRG = findViewById(R.id.radioGroup8);
        questionEightRG.clearCheck();

        // Clears question 9 radioButtons
        RadioGroup questionNineRG = findViewById(R.id.radioGroup9);
        questionNineRG.clearCheck();

        // Clears question 10 radioButtons
        RadioGroup questionTenRG = findViewById(R.id.radioGroup10);
        questionTenRG.clearCheck();

        correctAnswers = 0;
    }

}