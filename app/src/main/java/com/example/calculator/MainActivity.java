package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<txtValue1> extends AppCompatActivity {

    EditText txtValue1;
    EditText txtValue2;
    TextView lblAnswerbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue1 = findViewById(R.id.txtValue1);
        txtValue2 = findViewById(R.id.txtValue2);
        lblAnswerbox = findViewById(R.id.lblAnswerbox);
    }



    double answer;


    public void addCount(View v){

        String value1 = txtValue1.getText().toString();
        String value2 = txtValue2.getText().toString();

        double v1 = Double.parseDouble(value1);
        double v2 = Double.parseDouble(value2);

        answer= v1+v2;

        lblAnswerbox.setText("" + answer);
    }


    public void clearCount(View v) {

        txtValue1.setText(" ");
        txtValue2.setText(" ");
        answer =0;
        lblAnswerbox.setText(" ");
    }


}

