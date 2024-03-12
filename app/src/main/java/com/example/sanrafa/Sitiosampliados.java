package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Sitiosampliados extends AppCompatActivity {
    Sitios datosSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitiosampliados);
        datosSitios =(Sitios)getIntent().getSerializableExtra("datosSitios");
        Toast.makeText(datosSitios, "test", Toast.LENGTH_SHORT).show();
    }
}