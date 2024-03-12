package com.example.sanrafa;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resena extends AppCompatActivity {
    Button botonverhoteles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resena);

        botonverhoteles = findViewById(R.id.botonresena);


        botonverhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Resena.this,Hoteles.class);
                startActivity(intent);

            }
        });
    }
}