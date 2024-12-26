package com.example.patronesdiseno.factory;

import com.example.patronesdiseno.model.Vehiculo;

public abstract class VehiculoFactory {//clase que define el metodo factory
    public abstract Vehiculo crearVehiculo();

    public String obtenerDescripcion(){
        Vehiculo vehiculo = crearVehiculo();
        return String.format("Vehículo creado: %s, Ruedas: %d, Precio: %.2f",
                vehiculo.obtenerTipo(), vehiculo.obtenerRuedas(), vehiculo.obtenerPrecio());
    }
}
