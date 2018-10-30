package com.example.danivaro.calendar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOperacion = findViewById(R.id.btnOperacion);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        final TextView tvContador = findViewById(R.id.tvContador);
        final CheckBox cb = findViewById(R.id.checkBox);
        final Switch switchColor = findViewById(R.id.switchColor);
        switchColor.setChecked(true);
        //int contador = 0;

        btnOperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int contador = 0;
                int num;
                if(cb.isChecked()){
                    contador += 1;
                    contador = Integer.valueOf(tvContador.getText().toString());
                    tvContador.setText((contador);
                }else if(cb.isChecked() == false){
                    contador -= 1;
                    contador = Integer.valueOf(tvContador.getText().toString());
                    tvContador.setText(contador);
                }
            }
        });


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });

        switchColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchColor.isChecked()){
                    findViewById(R.id.panel1).setBackgroundColor(Color.WHITE);
                    switchColor.setText("Oscuro");
                }else if(switchColor.isChecked() == false){
                    findViewById(R.id.panel1).setBackgroundColor(Color.GRAY);
                    switchColor.setText("Claro");
                }
            }
        });

    }
}
