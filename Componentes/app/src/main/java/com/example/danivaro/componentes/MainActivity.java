package com.example.danivaro.componentes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar sbR = (SeekBar) findViewById(R.id.redSeekBar);
        SeekBar sbG = (SeekBar) findViewById(R.id.greenSeekbar);
        SeekBar sbB = (SeekBar) findViewById(R.id.blueSeekBar);

        private int redInt, greenInt, blueInt;

        sbR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redInt = progress;

                doSomethingWithColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        private void doSomethingWithColor() {
            int color = Color.rgb(redInt, greenInt, blueInt);
            // Do something with color
            //super.onCreate(savedInstanceState);
            //setContentView(R.layout.activity_color_changer);
        }

        //String hexColor = String.format("#%06X",(0xFFFFFF & intColor));
    }
}
