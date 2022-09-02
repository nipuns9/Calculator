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






    public void calculate(View v){

        String tag = v.getTag().toString();

        String value1 = txtValue1.getText().toString();
        String value2 = txtValue2.getText().toString();

        double v1 = Double.parseDouble(value1);
        double v2 = Double.parseDouble(value2);

        double answer=0;

       if (tag.equals("Add")){
           answer = v1 + v2;
       }

        if (tag.equals("Sub")){
            answer = v1 - v2;
        }

        if (tag.equals("Mul")){
            answer = v1 * v2;
        }

        if (tag.equals("Div")){
            answer = v1 / v2;
        }


        lblAnswerbox.setText("" + answer);
    }


    public void clearCount(View v) {

        txtValue1.setText(" ");
        txtValue2.setText(" ");
        double answer =0;
        lblAnswerbox.setText(" ");
    }


}

