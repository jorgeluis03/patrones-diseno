package com.example.patronesdiseno.controller;

import com.example.patronesdiseno.facade.TransferenciaFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {
    private final TransferenciaFacade transferenciaFacade;

    public TransferenciaController(TransferenciaFacade transferenciaFacade) {
        this.transferenciaFacade = transferenciaFacade;
    }

    @PostMapping
    public ResponseEntity<String> tranferir(@RequestParam String origen,
                                            @RequestParam String destino,
                                            @RequestParam double monto){
        String resultant = transferenciaFacade.realizarTransferencia(origen, destino, monto);
        return ResponseEntity.ok(resultant);
    }
}
