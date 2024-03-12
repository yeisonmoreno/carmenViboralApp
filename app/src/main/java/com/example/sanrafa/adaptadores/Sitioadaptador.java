package com.example.sanrafa.adaptadores;

import android.content.Context;
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
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class Sitioadaptador extends RecyclerView.Adapter<Sitioadaptador.viewHolder>
{
    public ArrayList<com.example.sanrafa.moldes.Sitios> listasitios;

    //constructor vacio
    public Sitioadaptador() {
    }

    //constructor lleno
    public Sitioadaptador(ArrayList<com.example.sanrafa.moldes.Sitios> listasitios) {
        this.listasitios = listasitios;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.pintarmolde(listasitios.get(position));

    }

    @Override
    public int getItemCount() {

        return listasitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        //asocio los elementos del xml del molde
        TextView nombresitiomolde;
        ImageView fotomoldesitio;
        TextView contactomolde;
        public viewHolder(@NonNull View itemView) {

            super(itemView);
            nombresitiomolde = itemView.findViewById(R.id.nombresitiomolde);
            fotomoldesitio = itemView.findViewById(R.id.fotomoldesitio);
            contactomolde = itemView.findViewById(R.id.contactomolde);
        }

        public void pintarmolde(Sitios sitios) {
           //no encuentra los get de nombre, precio, foto
            fotomoldesitio.setImageResource(sitios.getFotografia());
            nombresitiomolde.setText(sitios.getNombre());
            contactomolde.setText(sitios.getPrecio());

            //quiero escuchar click en cada uno de los elementos de la lista
            // la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Sitioadaptador.class);
                    itemView.getContext().startActivity(intent);
                }
            });


        }
    }
}
