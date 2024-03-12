package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Restaurantesampliados extends AppCompatActivity {
    Restaurantes datosrestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantesampliados);
        datosrestaurantes = (Restaurantes)getIntent().getSerializableExtra("datosRestaurantes");
        //Toast.makeText(this, datosrestaurantes, Toast.LENGTH_SHORT).show();


    }
}