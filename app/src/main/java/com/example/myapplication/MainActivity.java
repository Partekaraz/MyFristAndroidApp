package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // primero definir
    private Button btnAdd;
    private Button btnSubstract;
    private Button btnMultiply;
    private Button btnDivide;
    private EditText txtNum1;
    private EditText txtNum2;
    String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubstract =(Button)findViewById(R.id.btnSubstract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide =(Button)findViewById(R.id.btnDividir);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 =  (EditText) findViewById(R.id.txtNum2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, fruits);
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);

    }

    public void onClick(View view){

        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        ICalculator iCalculator = new Calculator(num1, num2);
        int result =iCalculator.add();
        Toast.makeText(getApplicationContext(),
                "The result of add is " + result,
                Toast.LENGTH_LONG).show();
    }

    public void onClickSubstract(View view){

        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        ICalculator iCalculator = new Calculator(num1, num2);
        int result =iCalculator.substract();
        Toast.makeText(getApplicationContext(),
                "The result of add is " + result,
                Toast.LENGTH_LONG).show();
    }

    public void onClickMultiply(View view){

        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        ICalculator iCalculator = new Calculator(num1, num2);
        int result =iCalculator.multiply();
        Toast.makeText(getApplicationContext(),
                "The result of add is " + result,
                Toast.LENGTH_LONG).show();
    }

    public void onClickDivide(View view){

        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        ICalculator iCalculator = new Calculator(num1, num2);
        int result =iCalculator.divide();
        Toast.makeText(getApplicationContext(),
                "The result of add is " + result,
                Toast.LENGTH_LONG).show();
    }
}
