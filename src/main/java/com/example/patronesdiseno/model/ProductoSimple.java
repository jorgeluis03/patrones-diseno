package com.example.patronesdiseno.model;

public class ProductoSimple implements ProductoComponent {
    private final String nombre;
    private final double precio;
    private final int cantidad;

    public ProductoSimple(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double obtenerPrecio() {
        return precio * cantidad;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
