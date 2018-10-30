package com.example.danivaro.calendario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import java.util.Calendar;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnCancelar = findViewById(R.id.btnCancelar);
        Button btnAceptar = findViewById(R.id.btnAceptar);
        final Intent it = new Intent(getApplicationContext(),MainActivity.class);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int hora = c.get(Calendar.HOUR_OF_DAY);
                int minutos = c.get(Calendar.MINUTE);
                int segundos = c.get(Calendar.SECOND);
                TimePicker tp = findViewById(R.id.tpHora);
                tp.setIs24HourView(true);
                tp.setCurrentHour(hora);
                tp.setCurrentMinute(minutos);
                //tp.is24HourView();
                String horaFor = String.format("%02d:%02d",hora,minutos);
                it.putExtra("hora",horaFor);
                setResult(RESULT_OK, it);
                finish();
            }
        });
    }
}
