package com.example.patronesdiseno.service;

import org.springframework.stereotype.Service;

@Service
public class RegistroTransaccionService {
    public void registrar(String cuentaOrigen, String cuentaDestino, double monto) {
        System.out.println("Registro: $" + monto + " de " + cuentaOrigen + " a " + cuentaDestino);
    }
}
