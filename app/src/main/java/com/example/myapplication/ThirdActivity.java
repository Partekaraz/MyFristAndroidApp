package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private String txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        Intent intentExtras = getIntent();
        txtNombre = intentExtras.getStringExtra("Nombre");

    }

    public void onClick(View view){

        Toast.makeText(getApplicationContext(),
                         "Nombre " + txtNombre,
                         Toast.LENGTH_LONG).show();

        // int num1 = Integer.parseInt(txtNum1.getText().toString());
        // int num2 = Integer.parseInt(txtNum2.getText().toString());
        // ICalculator iCalculator = new Calculator(num1, num2);
        // int result =iCalculator.add();
        // Toast.makeText(getApplicationContext(),
        //         "The result of add is " + result,
        //         Toast.LENGTH_LONG).show();
    }
}
