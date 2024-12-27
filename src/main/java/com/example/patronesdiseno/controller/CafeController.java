package com.example.patronesdiseno.controller;

import com.example.patronesdiseno.model.decorator.Cafe;
import com.example.patronesdiseno.model.decorator.CafeBase;
import com.example.patronesdiseno.model.decorator.ConChocolate;
import com.example.patronesdiseno.model.decorator.ConLeche;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cafes")
public class CafeController {
    @GetMapping("/personalizar")
    public ResponseEntity<String> personalizarCafe(@RequestParam (required = false) boolean leche,
                                                   @RequestParam (required = false) boolean chocolate) {
        //Inicia con un cafe base
        Cafe cafe = new CafeBase();

        //Añadir decoradores segun parametros
        if(leche){
            cafe = new ConLeche(cafe);
        }
        if(chocolate){
            cafe = new ConChocolate(cafe);
        }

        //Devolver la descripcion y el costo final del cafe
        String respuesta = String.format("Pedido: %s, Costo: $%.2f",cafe.descripcion(),cafe.costo());
        return ResponseEntity.ok(respuesta);
    }
}
