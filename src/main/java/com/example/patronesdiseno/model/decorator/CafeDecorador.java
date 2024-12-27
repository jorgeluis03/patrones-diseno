package com.example.patronesdiseno.model.decorator;
//Decorador abstracto para agregar complementos al cafe
public abstract class CafeDecorador implements Cafe{
    protected Cafe cafeDecorador;

    public CafeDecorador(Cafe cafeDecorador) {
        this.cafeDecorador = cafeDecorador;
    }

    @Override
    public String descripcion() {
        return cafeDecorador.descripcion();
    }

    @Override
    public double costo() {
        return cafeDecorador.costo();
    }
}
