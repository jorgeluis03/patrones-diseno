package com.example.patronesdiseno.controller;
import com.example.patronesdiseno.model.ProductoComponent;
import com.example.patronesdiseno.service.InventarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping("/resumen")
    public ResponseEntity<String> obtenerInventario(){
        ProductoComponent combo = inventarioService.obtenerInventario();
        String resultado = String.format(
                "Inventario: %s\nPrecio Total: $%.2f\nCantidad Total: %d unidades",
                combo.obtenerNombre(),
                combo.obtenerPrecio(),
                combo.obtenerCantidad()
        );
        return ResponseEntity.ok(resultado);
    }
}
