package com.appdeveloperrakib.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, counter_text;
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.welcome_text);
        counter_text = findViewById(R.id.counter_text);
        btn = findViewById(R.id.button);


        //Adding the functionalities

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter_text.setText(""+increaseCounter());


            }
        });



    }
    //End of OnCreate
     public int increaseCounter(){

        return ++counter;

     }
}