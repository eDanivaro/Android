package com.example.danivaro.ejercicio2tema1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    ArrayList<Libros> libros = new ArrayList<Libros>();
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayList<String> libros = new ArrayList<String>();
        final Intent it = new Intent(getApplicationContext(),Main2Activity.class);
        final Button btnNuevo = findViewById(R.id.btnNuevo);
        final Button btnSiguiente = findViewById(R.id.btnSiguiente);
        final Button btnAnterior = findViewById(R.id.btnAnterior);
        final TextView tvTitulo = findViewById(R.id.tvTitulo);
        final TextView tvAutor = findViewById(R.id.tvAutor);

        libros.add(new Libros("La comunidad del anillo", "JJ R Tolkien"));
        libros.add(new Libros("Las dos torres", "J Tolkien"));
        libros.add(new Libros("El retorno del rey", "Tolkien"));
        libros.add(new Libros("Viaje al centro de la tierra","Julio Verne"));

        final String titulo;// = (String) it.getSerializableExtra("titulo");
        final String autor;// = it.getStringExtra("autor");
        //String [] datosArray = libros.toArray(new String[1]);
        tvTitulo.setText(libros.get(0).autor);
        tvAutor.setText(libros.get(0).titulo);

        //Boton que muestra la activity2, donde se anade un libro a la coleccion
        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ArrayList<String> libros = new ArrayList<String>();
                //Intent it = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(it);
                //String titulo = (String) it.getSerializableExtra("titulo");
                //String autor = String.valueOf(it.getSerializableExtra("autor"));
                String titulo = it.getStringExtra("titulo");
                String autor = it.getStringExtra("autor");

                //RatingBar ratingBar = it.getStringExtra("valoracion");
                //float valoracion = Float.parseFloat(it.getStringExtra("valoracion"));
                libros.add(new Libros(titulo, autor));
                tvTitulo.setText(libros.get(0).titulo);
                tvAutor.setText(libros.get(0).autor);

                startActivity(it);
            }
        });

        //Btn siguiente
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(libros.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Coleccion vacia",Toast.LENGTH_LONG).show();
                }
                else {
                    libros.get(posicion);
                    if(posicion > libros.size()) {
                        Toast.makeText(getApplicationContext(),"Fin coleccion",Toast.LENGTH_SHORT).show();
                    }else{
                        tvTitulo.setText(libros.get(posicion).titulo);
                        tvAutor.setText(libros.get(posicion).autor);
//                    tvAutor.setText("La comunidad del anillo");
                        posicion += 1;
                    }

                }
            }
        });

        //Btn anterior
        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(libros.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Coleccion vacia", Toast.LENGTH_LONG).show();
                }else {
                    libros.lastIndexOf(posicion);
                    libros.get(posicion);
                    tvTitulo.setText(libros.get(posicion).titulo);
                    tvAutor.setText(libros.get(posicion).autor);
                    posicion -= 1;
                }
            }
        });
    }
}
