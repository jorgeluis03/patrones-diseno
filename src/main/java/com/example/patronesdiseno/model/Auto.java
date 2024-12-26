package com.example.patronesdiseno.model;

public class Auto implements Vehiculo{
    @Override
    public String obtenerTipo() {
        return "Auto";
    }

    @Override
    public int obtenerRuedas() {
        return 4;
    }

    @Override
    public double obtenerPrecio() {
        return 15000.00;
    }
}
