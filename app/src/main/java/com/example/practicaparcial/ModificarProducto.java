package com.example.practicaparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class ModificarProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_producto);


        ActionBar toolbar =  getSupportActionBar();
        toolbar.setDisplayHomeAsUpEnabled(true);

        Producto producto = new Producto();
        ProductController productController = new ProductController(producto);
        ProductView productView = new ProductView(this, productController,producto) ;
        productController.setProductView(productView);
        productController.setActivitymodificarproducto(this);
        productView.posicion_a_actualizar =  (Integer)super.getIntent().getExtras().get("posicion");


    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();


        if (id == android.R.id.home) {
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
