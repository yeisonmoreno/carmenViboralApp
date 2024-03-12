package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.Hoteladaptador;
import com.example.sanrafa.adaptadores.Sitioadaptador;
import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Restaurantes;
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {
    ArrayList <Sitios> Listasitios = new ArrayList<>();
    RecyclerView recyclerViewsitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listasitios);

        recyclerViewsitios = findViewById(R.id.listadinamicadesitios);
        recyclerViewsitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearlistahoteles();

        Hoteladaptador adaptador = new Hoteladaptador();
        recyclerViewsitios.setAdapter(adaptador);



    }

    public void crearlistahoteles(){
        Listasitios.add(new com.example.sanrafa.moldes.Sitios("Sitio lucuri","20000","42234" ,"por ahi cerca",4,R.drawable.hotellozeta));
        Listasitios.add(new com.example.sanrafa.moldes.Sitios("Sitio murat","20000","42234" ,"por ahi cerca",4,R.drawable.hotelmurat));
        Listasitios.add(new com.example.sanrafa.moldes.Sitios("Sitio lozeta","20000","42234" ,"por ahi cerca",4,R.drawable.hotellozeta));
        Listasitios.add(new com.example.sanrafa.moldes.Sitios("Sitio tinny house","20000","42234" ,"por ahi cerca",4,R.drawable.hoteltinnyhouse));
        Listasitios.add(new com.example.sanrafa.moldes.Sitios("Sitio villa claudia","20000","42234" ,"por ahi cerca",4,R.drawable.hotelvillaclaudia));
        Listasitios.add(new com.example.sanrafa.moldes.Sitios("Sitio mirador rivera","20000","42234" ,"por ahi cerca",4,R.drawable.hotelmiradorrivera));
    }
}