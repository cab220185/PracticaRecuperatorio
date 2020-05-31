package com.example.practicaparcial;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<MyViewHolder>   {

    private List<Producto> lista;
    private MyOnItemClick listener;



    public MyAdapter(List<Producto> lista, MyOnItemClick listener)
    {
        this.lista=lista;
        this.listener= listener;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,
                parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v , this.listener);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        Producto p = lista.get(position);
        holder.txtCantidad.setText(p.getCantidad());
        holder.txtPrecioUnitario.setText(p.getPrecioUnitario());
        holder.txtNombreProducto.setText(p.getNombreProducto());
        holder.setPosition(position);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }




}
