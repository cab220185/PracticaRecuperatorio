package com.example.practicaparcial;

import android.app.Activity;
import android.view.View;

public class ProductController implements View.OnClickListener {

    Producto producto ;
    ProductView productView ;


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public ProductView getProductView() {
        return productView;
    }

    public void setProductView(ProductView productView) {
        this.productView = productView;
    }



    public ProductController (Producto producto){
        this.producto = producto ;

    }

    @Override
    public void onClick(View v) {

    productView.loadView();
    productView.CargarModelo ();
    MainActivity.productoactualizado = producto ;
    productView.Finalizar();
    }
}
