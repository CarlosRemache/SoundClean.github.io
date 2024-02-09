package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CuatroActivity extends AppCompatActivity {

    Button button_play;
    Button button10;
    MediaPlayer b, c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
        button_play = (Button)findViewById(R.id.button_play);
        b = MediaPlayer.create(this,R.raw.frecuencia300);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b.isPlaying()) {
                    b.pause();
                    Toast.makeText(CuatroActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                }else{
                    b.start();
                    Toast.makeText(CuatroActivity.this, "Play", Toast.LENGTH_SHORT).show();

                }

            }
        });

        button10 =(Button)findViewById(R.id.button10);
        c = MediaPlayer.create(this,R.raw.frecuencia400);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.isPlaying()) {
                    c.pause();
                    Toast.makeText(CuatroActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                }else{
                    c.start();
                    Toast.makeText(CuatroActivity.this, "Play", Toast.LENGTH_SHORT).show();

                }


            }
        });



    }

    public void sigui(View view){
        Intent siguiente =new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }







}