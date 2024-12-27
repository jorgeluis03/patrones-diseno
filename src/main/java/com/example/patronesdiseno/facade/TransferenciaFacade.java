package com.example.patronesdiseno.facade;

import com.example.patronesdiseno.service.RegistroTransaccionService;
import com.example.patronesdiseno.service.SaldoService;
import com.example.patronesdiseno.service.ValidacionCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaFacade {
    private final ValidacionCuentaService validacionCuentaService;
    private final RegistroTransaccionService registroTransaccionService;
    private final SaldoService saldoService;

    public TransferenciaFacade(ValidacionCuentaService validacionCuentaService, RegistroTransaccionService registroTransaccionService, SaldoService saldoService) {
        this.validacionCuentaService = validacionCuentaService;
        this.registroTransaccionService = registroTransaccionService;
        this.saldoService = saldoService;
    }

    public String realizarTransferencia(String cuentaOrigen, String cuentaDestino, double monto) {
        //validar cuentas
        if(validacionCuentaService.validarCuenta(cuentaOrigen) || !validacionCuentaService.validarCuenta(cuentaDestino)) {
            throw new IllegalArgumentException("Cuenta inválida.");
        }

        //verificar saldo
        if(!saldoService.verificarSaldo(monto)){
            throw new IllegalArgumentException("Saldo insuficiente.");
        }

        //realizar transferencia
        saldoService.debitarSaldo(cuentaOrigen, monto);
        registroTransaccionService.registrar(cuentaOrigen, cuentaDestino, monto);

        return "Transferencia realizada con exito";
    }

}
