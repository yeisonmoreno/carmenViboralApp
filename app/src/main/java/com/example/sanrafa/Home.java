package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ATRIBUTOS PARA REFERENCIAS ELEMENTOS GRAFICOS
    //QUE TENGO YO EN EL XML QUE QUIERO CONTROLAR EN JAVA
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //asociar las variables creadas con los ID de los
        //elementos que vienen desde XML
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitios=findViewById(R.id.botonsitios);

        //Escuchar eventos (clic en los botones)
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aca escribo lo que quiera hacer cuando presionen el boton
                //Toast.makeText(Home.this, "hizo clic en hoteles", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this,Hoteles.class);
                startActivity(intent);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hizo click en el Restaurante", Toast.LENGTH_SHORT).show();
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "hizo clic en Sitios Turisticos", Toast.LENGTH_SHORT).show();
            }
        });



    }

    //cargar el menu de opcion deseado
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Que hago en cada opcion del menu
    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();

        if(itemSeleccionado==R.id.opcion1){
            Toast.makeText(this, "presiono opcion 1", Toast.LENGTH_SHORT).show();
        }else if(itemSeleccionado==R.id.opcion2){
            Toast.makeText(this, "presiono opcion 2", Toast.LENGTH_SHORT).show();
        }else if(itemSeleccionado==R.id.opcion3){
            Toast.makeText(this, "presiono opcion 3", Toast.LENGTH_SHORT).show();
        }else if(itemSeleccionado==R.id.opcion4){
            Toast.makeText(this, "presiono opcion 4", Toast.LENGTH_SHORT).show();
        }else if(itemSeleccionado==R.id.opcion5){
            Toast.makeText(this, "presiono opcion 5", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}