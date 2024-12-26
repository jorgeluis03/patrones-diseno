package com.example.patronesdiseno.factory;

import com.example.patronesdiseno.model.Moto;
import com.example.patronesdiseno.model.Vehiculo;

public class MotoFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Moto();
    }
}
