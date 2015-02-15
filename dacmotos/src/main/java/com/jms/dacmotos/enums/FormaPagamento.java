/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.enums;

/**
 *
 * @author Moises
 */
public enum FormaPagamento {

    VISA("VISA"),
    MASTECARD("MASTERCARD"),
    VISA_ELECTRON("VISA ELECTRON"),
    CHEQUE("CHEQUE"),
    DINHEIRO("DINHEIRO");
    public String forma;

    FormaPagamento(String forma) {
        this.forma = forma;
    }
}
