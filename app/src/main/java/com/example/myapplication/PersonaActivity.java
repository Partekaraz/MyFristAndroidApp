package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class PersonaActivity extends AppCompatActivity {

    private Spinner spinnerProvincia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);

        addListenerOnSpinnerItemSelection();
    }

    public void addListenerOnSpinnerItemSelection() {
        spinnerProvincia = (Spinner) findViewById(R.id.spinnerProvincia);
        spinnerProvincia.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

}
