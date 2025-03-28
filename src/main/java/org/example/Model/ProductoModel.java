package org.example.Model;

public class ProductoModel {
     public String nombre;
  private   int  cantidad;
   private String categoria;
  private   double precio;
  private   double costo;
    private Boolean reservado;

    public ProductoModel(String nombre, int cantidad,String categoria, double precio, double costo,boolean reservado){

        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
        this.costo = costo;
        this.reservado = reservado;

    }
    public ProductoModel(){}
    public ProductoModel(String nombre, int cantidad, String categoria){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

}
