package com.example.patronesdiseno.model.decorator;

public class ConChocolate extends CafeDecorador{
    public ConChocolate(Cafe cafeDecorador) {
        super(cafeDecorador);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", con chocolate";
    }

    @Override
    public double costo() {
        return super.costo() + 0.75;
    }
}
