package com.example.patronesdiseno.service;

import org.springframework.stereotype.Service;

@Service
public class ValidacionCuentaService {
    public boolean validarCuenta(String cuenta) {
        return cuenta != null && cuenta.length() == 10;
    }
}
