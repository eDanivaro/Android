package com.example.danivaro.datospersonales;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button botonPrincipal = findViewById(R.id.botonPrincipal);
        final Button botonPosicion = findViewById(R.id.botonPosicion);

        botonPosicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Main2Activity.class);
                EditText et = findViewById(R.id.editText);
                it.putExtra("dato",et.getText().toString()); // name: "dato",et.getText().toString();
                startActivityForResult(it,1);
                startActivity(it);
            }
        });

        botonPosicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_VIEW);
                it.setData(Uri.parse("geo:42.237109,8.723474"));
                if(it.resolveActivity(getPackageManager()) != null){
                    startActivity(it);
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.op1:
//                Toast.makeText(this,"opcion1",Toast.LENGTH_LONG).show();
//                break;
//
//            case  R.id.op2:
//                Toast.makeText(this,"opcion1",Toast.LENGTH_LONG).show();
//                break;
//        }
        return super.onOptionsItemSelected(item);
    }


    public void borrame(MenuItem mi){
        Toast.makeText(this, mi.getTitle(),Toast.LENGTH_LONG).show();
    }
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2 && resultCode==RESULT_OK){
            TextView tv = findViewById(R.id.editText);
            tv.setText(data.getFloatExtra("valor",0)+"");
        }

    }*/
}
