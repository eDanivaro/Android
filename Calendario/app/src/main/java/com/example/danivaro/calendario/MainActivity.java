package com.example.danivaro.calendario;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int contador = 0;
    private TextView tvFecha;
    private TextView tvHora;
    final ArrayList<String> lista = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent it = new Intent(getApplicationContext(), Main2Activity.class);
        final Intent it3 = new Intent(getApplicationContext(),Main3Activity.class);
        Button btnOperacion = findViewById(R.id.btnOperacion);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        final TextView tvContador = findViewById(R.id.tvContador);
        final TextView tvRadio = findViewById(R.id.tvRadio);
        final CheckBox cb = findViewById(R.id.checkBox);
        final Switch switchColor = findViewById(R.id.switchColor);
        tvFecha = findViewById(R.id.tvFecha);
        tvHora = findViewById(R.id.tvHora);

        ListView lv = findViewById(R.id.listViewSistemas);
        String[] sistemas

        switchColor.setChecked(true);
        Button btnFecha = findViewById(R.id.btnFecha);
        Button btnHora = findViewById(R.id.btnHora);

        btnOperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                int num;
                if(cb.isChecked()){
                    contador += 1;
                    contador = Integer.valueOf(tvContador.getText().toString());
                    tvContador.setText((contador));
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
                String texto = "0";
                if(checkedId == R.id.rb3){
                    texto = "Boton 3";
                }
                else if(checkedId == R.id.rb2){
                    texto = "Boton 2";
                }
                else if(checkedId ==  R.id.rb1){
                    texto = "Boton 1";
                }
                tvRadio.setText(texto);
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

        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(it, 1);
//                String date = it.getStringExtra("fecha");
            }
        });

        btnHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(it3,3);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menuactivity, menu);
            return true;
        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                tvFecha.setText(data.getStringExtra("date"));
            }
        }
        else if(requestCode == 3){
            if(resultCode == RESULT_OK){
                tvHora.setText(data.getStringExtra("hora"));
            }
        }
//        String date = it.getStringExtra("fecha");
//        tvFecha.setText("date");
    }
}
