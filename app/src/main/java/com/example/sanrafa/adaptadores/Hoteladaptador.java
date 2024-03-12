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
import com.example.sanrafa.Listahoteles;
import com.example.sanrafa.R;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class Hoteladaptador extends RecyclerView.Adapter<Hoteladaptador.viewHolder>
{
    //atributos de la clase
    public ArrayList <Hotel> listahoteles;

    //constructor vacio
    public Hoteladaptador() {
    }


    //constructor lleno
    public Hoteladaptador(ArrayList<Hotel> listahoteles) {

        this.listahoteles = listahoteles;
    }

    @NonNull
    @Override
    public Hoteladaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Hoteladaptador.viewHolder holder, int position) {
        holder.pintarmolde(listahoteles.get(position));

    }

    @Override
    public int getItemCount() {

        return listahoteles.size();
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

        public void pintarmolde(Hotel hotel) {
            fotohotelmolde.setImageResource(hotel.getFotografia());
            nombrehotelmolde.setText(hotel.getNombre());
            preciohotel.setText(hotel.getPrecio());

            //quiero escuchar click en cada uno de los elementos de la lista
            // la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Hotelesampliados.class);
                    intent.putExtra("datoshotel",hotel);

                    itemView.getContext().startActivity(intent);
                }
            });




        }
    }
}
