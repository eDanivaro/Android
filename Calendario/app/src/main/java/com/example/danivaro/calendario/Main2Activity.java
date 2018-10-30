package com.example.danivaro.calendario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Intent it2 = new Intent(getApplicationContext(),MainActivity.class);
        Button btnAceptar = findViewById(R.id.btnAceptar);
        Button btnCancelar = findViewById(R.id.btnCancelar);

//        Calendar c = Calendar.getInstance();
//        int dia = c.get(Calendar.MONTH);
//        int mes = c.get(Calendar.DAY_OF_MONTH);
//        int anho = c.get(Calendar.YEAR);
//        DatePicker dp = findViewById(R.id.calendario);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(it2);
                finish();
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
//                int dia = c.get(Calendar.DAY_OF_MONTH);
//                int mes = c.get(Calendar.MONTH)+1;
//                int anho = c.get(Calendar.YEAR);
//                it2.putExtra("fecha", dia+"/"+mes+"/"+anho);
                DatePicker dp = findViewById(R.id.calendario);
                int day = dp.getDayOfMonth();
                int month = dp.getMonth()+1;
                int year = dp.getYear();
                String fecha = String.format("%02d/%02d/%04d", day,month,year);
                it2.putExtra("date",fecha);
                setResult(RESULT_OK,it2);
                finish();
            }
        });
    }
}
