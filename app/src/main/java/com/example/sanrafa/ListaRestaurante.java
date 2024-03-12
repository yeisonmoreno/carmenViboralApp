package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.Hoteladaptador;
import com.example.sanrafa.adaptadores.Restaurantesadaptador;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class ListaRestaurante extends AppCompatActivity {
    ArrayList <com.example.sanrafa.moldes.Restaurantes> listarestaurante = new ArrayList<>();
    RecyclerView recyclerViewrestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerViewrestaurantes = findViewById(R.id.listadimanicarestaurante);
        recyclerViewrestaurantes .setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearlistahoteles();

        Restaurantesadaptador adaptador = new Restaurantesadaptador(listarestaurante);
        recyclerViewrestaurantes.setAdapter(adaptador);



    }
    public void crearlistahoteles(){
        listarestaurante.add(new com.example.sanrafa.moldes.Restaurantes("Restaurante lucuri","20000","42234" ,"por ahi cerca",4,R.drawable.hotellozeta));
        listarestaurante.add(new com.example.sanrafa.moldes.Restaurantes("Restaurante murat","20000","42234" ,"por ahi cerca",4,R.drawable.hotelmurat));
        listarestaurante.add(new com.example.sanrafa.moldes.Restaurantes("Restaurante lozeta","20000","42234" ,"por ahi cerca",4,R.drawable.hotellozeta));
        listarestaurante.add(new com.example.sanrafa.moldes.Restaurantes("Restaurante tinny house","20000","42234" ,"por ahi cerca",4,R.drawable.hoteltinnyhouse));
        listarestaurante.add(new com.example.sanrafa.moldes.Restaurantes("Restaurante villa claudia","20000","42234" ,"por ahi cerca",4,R.drawable.hotelvillaclaudia));
        listarestaurante.add(new com.example.sanrafa.moldes.Restaurantes("Restaurante mirador rivera","20000","42234" ,"por ahi cerca",4,R.drawable.hotelmiradorrivera));
    }
}