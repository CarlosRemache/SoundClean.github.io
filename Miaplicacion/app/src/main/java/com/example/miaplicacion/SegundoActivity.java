package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }


    //metodo para el boton siguiente
    public void Anterior(View view){
        Intent anterior =new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

    public void bajo(View view){
        Intent bajo =new Intent(this, TercerActivity.class);
        startActivity(bajo);
    }

    public void medio(View view){
        Intent medio =new Intent(this, CuatroActivity.class);
        startActivity(medio);
    }

    public void alto(View view){
        Intent alto =new Intent(this, QuintoActivity.class);
        startActivity(alto);
    }



}