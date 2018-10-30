package com.example.danivaro.ejercicio1tema1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent it2 = getIntent();

       float valor1 = Float.parseFloat(it2.getStringExtra("operador1"));
       float valor2 = Float.parseFloat(it2.getStringExtra("operador1"));

        TextView tvSuma = findViewById(R.id.etSuma);
        TextView tvResta = findViewById(R.id.etResta);
        TextView tvMultiplicacion = findViewById(R.id.etMultiplicacion);
        TextView tvDivision = findViewById(R.id.etDivision);

        tvSuma.setText(""+(valor1+valor2));
        tvResta.setText(""+(valor1-valor2));
        tvMultiplicacion.setText(""+(valor1*valor2));
        tvDivision.setText(""+(valor1/valor2));
    }
}
