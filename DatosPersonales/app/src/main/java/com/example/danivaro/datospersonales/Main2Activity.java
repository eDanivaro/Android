package com.example.danivaro.datospersonales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import javax.xml.transform.Result;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent it2 = getIntent();
        TextView tv2 = findViewById(R.id.tv2);
        tv2.setText(it2.getStringExtra("datos"));


        RatingBar rt = findViewById(R.id.ratingBar);
        Intent datos = new Intent();
        datos.putExtra("valor",rt.getRating());

        setResult(RESULT_OK,datos);

        finish();
    }
}
