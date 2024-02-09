package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuintoActivity extends AppCompatActivity {

    Button button1_play;
    Button button2;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto);
        button1_play= (Button)findViewById(R.id.button1_play);
        mp = MediaPlayer.create(this,R.raw.frecuencia1000);
        button1_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()) {
                    mp.pause();
                    Toast.makeText(QuintoActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp.start();
                    Toast.makeText(QuintoActivity.this, "Play", Toast.LENGTH_SHORT).show();

                }

            }
        });


        button2=findViewById(R.id.button9);



    }
    public void sigu(View view){
        Intent atras =new Intent(this, SegundoActivity.class);
        startActivity(atras);
    }


    public void sigui(View view){
        Intent siguiente =new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }




// para cerrar la aplicacion
    @SuppressLint("")
    public void salir(View view){
        finishAffinity();
    }








}