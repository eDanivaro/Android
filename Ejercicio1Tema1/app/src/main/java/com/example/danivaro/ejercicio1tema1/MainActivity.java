package com.example.danivaro.ejercicio1tema1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnOperacion = findViewById(R.id.btnOperacion);


        btnOperacion.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent it = new Intent(getApplicationContext(),Main2Activity.class);
                EditText et1 = findViewById(R.id.etOperador1);
                EditText et2 = findViewById(R.id.etOperador2);
                String num1=et1.getText().toString().trim();
                String num2=et2.getText().toString().trim();
                if(num1.length()==0 || num2.length()==0){
                    Toast.makeText(getApplicationContext(),"Campo vacio",Toast.LENGTH_LONG).show();
                }else {
//                    it.putExtra("operador1", et1.getText().toString().trim());
//                    it.putExtra("operador2", et2.getText().toString().trim());
                    it.putExtra("operador1",num1);
                    it.putExtra("operador1",num2);
                    startActivity(it);
                }
                return false;
            }
        });

        btnOperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Aprieta mas tiempo", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
