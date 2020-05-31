package com.example.practicaparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public


class MainActivity extends AppCompatActivity implements MyOnItemClick {


    Producto producto ;
    MyAdapter adapter ;
    static List<Producto> Productos;
    private static MainActivity activity;
    static Producto productoactualizado ;
    static Activity mainactivity ;
    static int posicionactualizado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Productos = new ArrayList<Producto>();
        Productos.add(new Producto("Cocacola","1","5"));
        Productos.add(new Producto("Pepsi","3","5"));
        Productos.add(new Producto("jorgelin","123456789","123456789"));
        Productos.add(new Producto("fanta","8","5"));
        Productos.add(new Producto("ades","10","5"));
        Productos.add(new Producto("Gatorade","20","5"));
        Productos.add(new Producto("Quilmes","21","5"));
        Productos.add(new Producto("fosforos","22","5"));
        Productos.add(new Producto("jabon","16","5"));
        Productos.add(new Producto("pintura","18","5"));
        Productos.add(new Producto("galletitas","20","5"));
        Productos.add(new Producto("yogurt","2","5"));

        mainactivity = this ;
        RecyclerView list = (RecyclerView)findViewById(R.id.list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        list.setLayoutManager(layoutManager);

        adapter = new MyAdapter(Productos,this);
        list.setAdapter(adapter);

    }

    @Override
    public void onItemClick(int position) {

        Intent intent = new Intent(this,ModificarProducto.class);
        posicionactualizado = position;
        super.startActivity(intent);


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Productos.get(posicionactualizado).setCantidad(productoactualizado.cantidad );
        Productos.get(posicionactualizado).setNombreProducto(productoactualizado.nombreProducto );
        Productos.get(posicionactualizado).setPrecioUnitario(productoactualizado.precioUnitario );
        adapter.notifyItemChanged(posicionactualizado);
    }
}
