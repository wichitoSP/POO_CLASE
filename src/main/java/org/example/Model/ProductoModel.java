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

    // accesores permitir leer valor

    public String getNombre(){
        return  this.nombre;
    }

    public int getCantidad(){
         return this.cantidad;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public  Double getPrecio(){

        return this.precio;
    }

    public Double getcosto(){

        return this.costo;
    }



    // Modificadores Seterar la propiedad

    public void  setNombre(String nombre){
        this.nombre = nombre;
    }

    public void  setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public  void  setCosto(double costo){
        this.costo = costo;
    }






}
