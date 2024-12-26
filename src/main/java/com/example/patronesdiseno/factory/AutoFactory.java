package com.example.patronesdiseno.factory;

import com.example.patronesdiseno.model.Auto;
import com.example.patronesdiseno.model.Vehiculo;

public class AutoFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
