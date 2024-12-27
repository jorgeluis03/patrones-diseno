package com.example.patronesdiseno.model.decorator;
//Decorador concreto: añade leche al cafe
public class ConLeche extends CafeDecorador{
    public ConLeche(Cafe cafeDecorador) {
        super(cafeDecorador);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", con leche";
    }

    @Override
    public double costo() {
        return super.costo() + 0.50;
    }
}
