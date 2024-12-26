package com.example.patronesdiseno.model;

public class Moto implements Vehiculo{
    @Override
    public String obtenerTipo() {
        return "Moto";
    }

    @Override
    public int obtenerRuedas() {
        return 2;
    }

    @Override
    public double obtenerPrecio() {
        return 5000.00;
    }
}
