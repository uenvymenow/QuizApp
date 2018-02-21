package com.example.android.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // called from the onClick for the submit_answers_button in activity_main.xml
    public void submitAnswers(View view){
        // Calls the check answers method

        // Calls the calculate answers method

        // Calls the display method
    }
}
