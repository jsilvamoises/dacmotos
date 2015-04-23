/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;


import com.jms.dacmotos.enums.StatusCadastroCliente;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ApplicationScoped
public class BeanStatusPessoa implements Serializable{
    private StatusCadastroCliente status;
    private StatusCadastroCliente[] statusPessoa;

    public BeanStatusPessoa() {
    }

    public StatusCadastroCliente getStatus() {
        return status;
    }

    public void setStatus(StatusCadastroCliente status) {
        this.status = status;
    }

    public StatusCadastroCliente[] getStatusPessoa() {
        return StatusCadastroCliente.values();
    }

    public void setStatusPessoa(StatusCadastroCliente[] statusPessoa) {
        this.statusPessoa = statusPessoa;
    }

    

}
