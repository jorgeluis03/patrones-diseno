package com.example.patronesdiseno.model;

import java.util.ArrayList;
import java.util.List;

public class PaqueteProducto implements ProductoComponent{

    private final String nombre;
    private final List<ProductoComponent> componentes = new ArrayList<>();

    public PaqueteProducto(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComponente(ProductoComponent componente) {
        componentes.add(componente);
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double obtenerPrecio() {
        double precioTotal = 0.0;
        for (ProductoComponent component : componentes) {
            precioTotal += component.obtenerPrecio();
        }
        return precioTotal;
    }

    @Override
    public int obtenerCantidad() {
        int cantidadTotal = 0;
        for (ProductoComponent componente : componentes) {
            cantidadTotal += componente.obtenerCantidad();
        }
        return cantidadTotal;
    }
}
