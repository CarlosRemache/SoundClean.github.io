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

public class TercerActivity extends AppCompatActivity {

    Button button_play;
    Button button8;
    MediaPlayer mp, a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        button_play = (Button)findViewById(R.id.button_play);
        mp = MediaPlayer.create(this,R.raw.frecuenccia100);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()) {
                    mp.pause();
                    Toast.makeText(TercerActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp.start();
                    Toast.makeText(TercerActivity.this, "Play", Toast.LENGTH_SHORT).show();

                }
            }
        });


        button8 =(Button)findViewById(R.id.button8);
        a = MediaPlayer.create(this,R.raw.frecuencia200);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.isPlaying()) {
                    a.pause();
                    Toast.makeText(TercerActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    a.start();
                    Toast.makeText(TercerActivity.this, "Play", Toast.LENGTH_SHORT).show();

                }


            }
        });


    }

    public void salir(View view){
        Intent salir =new Intent(this, SegundoActivity.class);
        startActivity(salir);
    }












}
