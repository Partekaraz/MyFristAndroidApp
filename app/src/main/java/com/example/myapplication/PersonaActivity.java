package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class PersonaActivity extends AppCompatActivity {

    private Spinner spinnerProvincia;
    private Button btnEnviar;
    private EditText txtNombre;
    private EditText txtEmail;
    private EditText txtPassword;
    private Spinner spinnerProvincia2;
    private RadioButton radioButtonHombre;
    private RadioButton radioButtonMujer;
    private CheckBox checkBox1;
    private CheckBox checkBox2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);

        btnEnviar = (Button) findViewById(R.id.btnSend);
        txtNombre = (EditText) findViewById(R.id.NombreText);
        txtEmail = (EditText) findViewById(R.id.emailTest);
        txtPassword = (EditText) findViewById(R.id.passwordTest);
        spinnerProvincia2 = (Spinner) findViewById(R.id.spinnerProvincia);
        radioButtonHombre = (RadioButton) findViewById(R.id.radioButtonHombre);
        radioButtonMujer = (RadioButton) findViewById(R.id.radioButtonMujer);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

        addListenerOnSpinnerItemSelection();
    }

    public void addListenerOnSpinnerItemSelection() {
        spinnerProvincia = (Spinner) findViewById(R.id.spinnerProvincia);
        spinnerProvincia.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void onClick(View view){
        Intent intentBundle = new Intent(PersonaActivity.this,
                                         ThirdActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("Nombre", txtNombre.getText().toString());
        bundle.putString("Email", txtEmail.getText().toString());
        bundle.putString("Passsword", txtPassword.getText().toString());
        bundle.putString("Provincia", spinnerProvincia2.getSelectedItem().toString());
        bundle.putBoolean("Hombre", radioButtonHombre.isChecked());
        bundle.putBoolean("Mujer", radioButtonMujer.isChecked());
        bundle.putBoolean("Aficion1", checkBox1.isChecked());
        bundle.putBoolean("Aficion2", checkBox2.isChecked());

        intentBundle.putExtras(bundle);
        startActivity(intentBundle);

        //Toast.makeText(getApplicationContext(),
        //                 "Nombre " + txtNombre.getText().toString(),
        //                 Toast.LENGTH_LONG).show();

       // int num1 = Integer.parseInt(txtNum1.getText().toString());
       // int num2 = Integer.parseInt(txtNum2.getText().toString());
       // ICalculator iCalculator = new Calculator(num1, num2);
       // int result =iCalculator.add();
       // Toast.makeText(getApplicationContext(),
       //         "The result of add is " + result,
       //         Toast.LENGTH_LONG).show();
    }

    public void onClickSendEmail(View view) {
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

        String aEmailList[] = {"tandaobien@gmail.com"};
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"aazor@covalco.es");
        emailIntent.setType("plain/text");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Prueba de correo");
        startActivity(emailIntent);
    }

}
