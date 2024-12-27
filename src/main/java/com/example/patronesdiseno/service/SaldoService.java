package com.example.patronesdiseno.service;

import org.springframework.stereotype.Service;

@Service
public class SaldoService {
    public boolean verificarSaldo(double monto) {
        return monto <= 5000.00;
    }

    public void debitarSaldo(String cuenta, double monto){
        System.out.println("Se debitó $"+monto+" de la cuenta "+cuenta);
    }
}
