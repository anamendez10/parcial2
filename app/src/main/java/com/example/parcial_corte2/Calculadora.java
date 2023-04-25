package com.example.parcial_corte2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    Button btnSumar, btnRestar;
    EditText txtNumber1, txtNumber2;
    TextView txtResult;

    int resultado = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        txtResult = findViewById(R.id.txtResult);
        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado  = suma(Integer.parseInt(txtNumber1.getText().toString()), Integer.parseInt(txtNumber2.getText().toString()));

                txtResult.setText(Integer.toString(resultado));
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = resta(Integer.parseInt(txtNumber1.getText().toString()), Integer.parseInt(txtNumber2.getText().toString()));
                txtResult.setText(Integer.toString(resultado));

            }
        });
    }

    public static int suma(int num1, int num2){
        return num1 + num2;
    }

    public static int resta(int num1, int num2){
        return num1 - num2;
    }
}