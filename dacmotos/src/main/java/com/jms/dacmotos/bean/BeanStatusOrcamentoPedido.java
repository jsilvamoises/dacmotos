/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.StatusPedidoOrcamento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class BeanStatusOrcamentoPedido implements Serializable{
    private static final Long serialVersionUID=1L;
    
    private StatusPedidoOrcamento statusPedidoOrcamento;
    private StatusPedidoOrcamento statusPedidoOrcamentoSelecionado;
    private List<StatusPedidoOrcamento> listaStatus;
    
    private InterfaceDao<StatusPedidoOrcamento> Dao(){
        InterfaceDao<StatusPedidoOrcamento> dao = new Dao<>(StatusPedidoOrcamento.class);
        return dao;
    }
    
    public void save(){
        System.out.println(statusPedidoOrcamento.getDescricao());
        if(Dao().save(statusPedidoOrcamento)){
            criarObjeto();
        }
        
    }
    
    public void saveOrUpdate(){
        System.out.println(statusPedidoOrcamento.getDescricao());
        if(Dao().saveOrUpdate(statusPedidoOrcamento)){
            criarObjeto();
        }
        
    }
    
    public void delete(){
        System.out.println(statusPedidoOrcamentoSelecionado.getDescricao());
        if(Dao().remove(statusPedidoOrcamentoSelecionado)){
            criarObjeto();
        }
        
    }
    
    public void update(){
        System.out.println(statusPedidoOrcamentoSelecionado.getDescricao());
        Dao().update(statusPedidoOrcamento);
        criarObjeto();
        
    }
    
    public void editar(){
        statusPedidoOrcamento = statusPedidoOrcamentoSelecionado;
         System.out.println(statusPedidoOrcamento.getDescricao());
    }
    
    public void criarObjeto(){
        statusPedidoOrcamento = new StatusPedidoOrcamento();
        listaStatus.clear();
    }
    
    

    public BeanStatusOrcamentoPedido() {
        listaStatus = new ArrayList<>();
        statusPedidoOrcamento = new StatusPedidoOrcamento();
        statusPedidoOrcamentoSelecionado = new StatusPedidoOrcamento();
    }

    public StatusPedidoOrcamento getStatusPedidoOrcamento() {
        return statusPedidoOrcamento;
    }

    public void setStatusPedidoOrcamento(StatusPedidoOrcamento statusPedidoOrcamento) {
        this.statusPedidoOrcamento = statusPedidoOrcamento;
    }

    public StatusPedidoOrcamento getStatusPedidoOrcamentoSelecionado() {
        return statusPedidoOrcamentoSelecionado;
    }

    public void setStatusPedidoOrcamentoSelecionado(StatusPedidoOrcamento statusPedidoOrcamentoSelecionado) {
        this.statusPedidoOrcamentoSelecionado = statusPedidoOrcamentoSelecionado;
    }

    public List<StatusPedidoOrcamento> getListaStatus() {
        listaStatus = Dao().getEntities();
        return listaStatus;
    }

    public void setListaStatus(List<StatusPedidoOrcamento> listaStatus) {
        this.listaStatus = listaStatus;
    }



    
    
    
}
