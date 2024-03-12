package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sitios2 extends AppCompatActivity {
    Button botonsitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios2);
        botonsitios = findViewById(R.id.botonsitios);

        botonsitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios2.this,ListaRestaurante.class);
                startActivity(intent);
            }
        });

    }
}