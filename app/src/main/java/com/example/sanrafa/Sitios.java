package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sitios extends AppCompatActivity {
    Button botontorre;
    Button botoncalle;
    Button botonruinas;
    Button botonSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);

        botontorre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios.this, Home.class);
                startActivity(intent);

            }
        });
        botoncalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios.this, Home.class);
                startActivity(intent);
            }
        });
        botonruinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios.this, Hoteles.class);
                startActivity(intent);
            }
        });
        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios.this,Hoteles.class);
            }
        });


    }
}