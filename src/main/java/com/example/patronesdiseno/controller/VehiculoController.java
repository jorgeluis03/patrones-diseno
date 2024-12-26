package com.example.patronesdiseno.controller;

import com.example.patronesdiseno.factory.AutoFactory;
import com.example.patronesdiseno.factory.MotoFactory;
import com.example.patronesdiseno.factory.VehiculoFactory;
import com.example.patronesdiseno.model.Vehiculo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @GetMapping("/{tipo}")
    public ResponseEntity<?> crearVehiculo(@PathVariable String tipo) {
        VehiculoFactory factory;

        switch (tipo){
            case "Auto":
                factory = new AutoFactory();
                break;
            case "Moto":
                factory = new MotoFactory();
                break;
            default:
                throw new IllegalArgumentException("Tipo de vehiculo invalido");
        }

        String descripcion = factory.obtenerDescripcion();
        return ResponseEntity.ok(descripcion);
    }
}
