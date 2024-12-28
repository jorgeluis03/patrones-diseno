package com.example.patronesdiseno.service;

import com.example.patronesdiseno.model.PaqueteProducto;
import com.example.patronesdiseno.model.ProductoComponent;
import com.example.patronesdiseno.model.ProductoSimple;
import org.springframework.stereotype.Service;

@Service
public class InventarioService {
    public ProductoComponent obtenerInventario(){
        ProductoComponent gaseosa = new ProductoSimple("Gaseosa", 2.00, 6);
        ProductoComponent galletas = new ProductoSimple("Galletas", 1.50, 10);

        PaqueteProducto paqueteGaseosas = new PaqueteProducto("Paquete de Gaseosas");
        paqueteGaseosas.agregarComponente(gaseosa);

        PaqueteProducto paqueteGalletas = new PaqueteProducto("Caja de Galletas");
        paqueteGalletas.agregarComponente(galletas);

        PaqueteProducto combo = new PaqueteProducto("Combo Fiesta");
        combo.agregarComponente(paqueteGaseosas);
        combo.agregarComponente(paqueteGalletas);
        combo.agregarComponente(new ProductoSimple("Snacks", 3.00, 5));

        return combo;
    }
}
