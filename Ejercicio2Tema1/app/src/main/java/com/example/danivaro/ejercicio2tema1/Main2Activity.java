package com.example.danivaro.ejercicio2tema1;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnAnadir = findViewById(R.id.btnAnadir);
        final Intent it2 = new Intent(getApplicationContext(),MainActivity.class);

        btnAnadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent it2 = new Intent(getApplicationContext(),MainActivity.class);
                EditText etTitulo = findViewById(R.id.etTitulo);
                EditText etAutor = findViewById(R.id.etAutor);
                //float valoracion = findViewById(R.id.rbEstrellas);
                RatingBar rbEstrellas = findViewById(R.id.rbEstrellas);
                String titulo = etTitulo.getText().toString().trim();
                String autor = etAutor.getText().toString().trim();

                if(titulo.length() == 0 || autor.length() == 0){
                    Toast.makeText(getApplicationContext(),"Campo vacio",Toast.LENGTH_LONG).show();
                }else {
                    it2.putExtra("titulo",titulo);
                    //it2.putExtra("nombre", titulo);
                    it2.putExtra("autor", autor);
                    //it2.putExtra("valoracion", (Parcelable) rbEstrellas);
//                    finish();
                    startActivity(it2);
                    //finish();
                }
            }
        });


    }
}
