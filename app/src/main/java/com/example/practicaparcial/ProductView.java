package com.example.practicaparcial;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class ProductView {

    Activity activity;
    Producto producto ;
    ProductController productController ;
    Integer posicion_a_actualizar ;

    Button btnmodificar ;
    EditText edtCantidad;
    EditText edtNombreProducto;
    EditText edtPrecioUnitario ;



    public ProductView ( Activity activity , ProductController productController , Producto producto){
        this. activity = activity ;
        this.productController = productController ;
        this.producto = producto ;
        this.btnmodificar = activity.findViewById(R.id.button_guardar);
        this.btnmodificar.setOnClickListener(productController);


    }


    public void loadView (){
     edtCantidad = (EditText) activity.findViewById(R.id.edtcantidad);
     edtNombreProducto = (EditText) activity.findViewById(R.id.edtNombreProducto);
     edtPrecioUnitario = (EditText) activity.findViewById(R.id.edtPrecioUnitario);


    }


    public void CargarModelo (){

        producto.cantidad = edtCantidad.getText().toString();

        producto.nombreProducto = edtNombreProducto.getText().toString();

        producto.precioUnitario = edtPrecioUnitario.getText().toString();

    }
}
