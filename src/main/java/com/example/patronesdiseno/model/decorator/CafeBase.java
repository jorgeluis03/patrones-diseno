package com.example.patronesdiseno.model.decorator;
// Clase base para el café simple
public class CafeBase implements Cafe{
    @Override
    public String descripcion() {
        return "Cafe simple";
    }

    @Override
    public double costo() {
        return 1.00;
    }
}
