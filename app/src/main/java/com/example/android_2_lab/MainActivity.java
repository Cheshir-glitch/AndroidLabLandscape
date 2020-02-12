package com.example.android_2_lab;

import androidx.appcompat.app.AppCompatActivity;
import  com.example.android_2_lab.QuadraticEquation;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected TextView text;
    protected TextView textInput;
    protected Button button;
    protected String constantStr ;

    QuadraticEquation qadr = new QuadraticEquation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.answer);
        textInput = findViewById(R.id.editTextInput);
        button = findViewById(R.id.calc);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              constantStr = textInput.getText().toString();

               text.setText(qadr.solveEqation(constantStr));
            }
        };

        button.setOnClickListener(listener);
    }

}
