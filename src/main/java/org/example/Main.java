package org.example;


import org.example.Model.ProductoModel;

public class Main {
    public static void main(String[] args) {
       ProductoModel producto = new ProductoModel();
       producto.setNombre("Audifonos");
       producto.setCantidad(12);
       producto.setCosto(78.8);

       System.out.println(producto.getNombre());
       System.out.println(producto.getCantidad());
       System.out.println(producto.getcosto());





    }
}