package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.Hotelesampliados;
import com.example.sanrafa.R;
import com.example.sanrafa.Restaurantesampliados;
import com.example.sanrafa.moldes.Restaurantes;

import java.util.ArrayList;

public class Restaurantesadaptador extends RecyclerView.Adapter<Restaurantesadaptador.viewHolder>
{
    public ArrayList <Restaurantes> listarestaurante;

    //constructor vacio


    public Restaurantesadaptador() {
    }

    //constructor lleno
    public Restaurantesadaptador(ArrayList<Restaurantes> listarestaurante) {
        this.listarestaurante = listarestaurante;
    }

    @NonNull
    @Override
    public Restaurantesadaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return  new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Restaurantesadaptador.viewHolder holder, int position) {
        holder.pintarmolde(listarestaurante.get(position));

    }

    @Override
    public int getItemCount() {

        return listarestaurante.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //asocio los elementos del xml del molde
        ImageView fotohotelmolde;
        TextView nombrehotelmolde;
        TextView preciohotel;

        public viewHolder(@NonNull View itemView) {

            super(itemView);
            fotohotelmolde = itemView.findViewById(R.id.fotomoldehotel);
            nombrehotelmolde = itemView.findViewById(R.id.nombrehotelmolde);
            preciohotel = itemView.findViewById(R.id.preciohotelmolde);
        }

        public void pintarmolde(Restaurantes restaurantes) {
            fotohotelmolde.setImageResource(restaurantes.getFotografia());
            nombrehotelmolde.setText(restaurantes.getNombre());
            preciohotel.setText(restaurantes.getPrecio());

            //quiero escuchar click en cada uno de los elementos de la lista
            // la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Hotelesampliados.class);
                    intent.putExtra("datoshotel",restaurantes);

                    itemView.getContext().startActivity(intent);
                }
            });


        }
    }
}
