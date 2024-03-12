package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.Hoteladaptador;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class Listahoteles extends AppCompatActivity {
    ArrayList<Hotel> listahoteles = new ArrayList<>();
    RecyclerView recyclerViewhoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);

        recyclerViewhoteles = findViewById(R.id.listadinamicadehoteles);
        recyclerViewhoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearlistahoteles();

        Hoteladaptador adaptador = new Hoteladaptador(listahoteles);
        recyclerViewhoteles.setAdapter(adaptador);



    }

    public void crearlistahoteles(){
        listahoteles.add(new Hotel("hotel lucuri","20000","42234" ,"por ahi cerca",4,R.drawable.hotellozeta));
        listahoteles.add(new Hotel("hotel murat","20000","42234" ,"por ahi cerca",4,R.drawable.hotelmurat));
        listahoteles.add(new Hotel("hotel lozeta","20000","42234" ,"por ahi cerca",4,R.drawable.hotellozeta));
        listahoteles.add(new Hotel("hotel tinny house","20000","42234" ,"por ahi cerca",4,R.drawable.hoteltinnyhouse));
        listahoteles.add(new Hotel("hotel villa claudia","20000","42234" ,"por ahi cerca",4,R.drawable.hotelvillaclaudia));
        listahoteles.add(new Hotel("hotel mirador rivera","20000","42234" ,"por ahi cerca",4,R.drawable.hotelmiradorrivera));
    }


}