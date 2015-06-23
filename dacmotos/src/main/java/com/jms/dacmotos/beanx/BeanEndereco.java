/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.beanx;

import com.jms.dacmotos.interfaces.InterfaceBean;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Endereco;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.suport.EnderecoSuport;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Moises
 */
@ManagedBean(name = "beanEndereco")
@SessionScoped
public class BeanEndereco implements Serializable, InterfaceBean {

    private static final Long SerialVersionUID = 1L;
    private Endereco endereco = new Endereco();
    private List<Endereco> enderecos;
    
    private EnderecoSuport suporte = new EnderecoSuport();

    @PostConstruct
    public void listarTodos() {
        enderecos = Dao().getEntities();
    }
    
    public Endereco getEnderecoByCep(String cep, String numero){
        return  suporte.getEnderecoByCep(cep, numero);
    }

    public boolean isIsEndereçoNull() {
        try {
            return !endereco.getCidade().isEmpty();
        } catch (Exception e) {
        }
        return false;

    }

    /**
     * Creates a new instance of BeanEndereco
     */
    public BeanEndereco() {
        //pessoa = new Endereco();
        // endereco = new Endereco();

        enderecos = new ArrayList<>();

    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private InterfaceDao<Endereco> Dao() {
        InterfaceDao<Endereco> marcaDao = new Dao<>(Endereco.class);
        return marcaDao;
    }

    @Override
    public void save() {
        if (Dao().save(endereco)) {

            endereco = new Endereco();
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List list() {
        return enderecos == null ? Dao().getEntities() : enderecos;
    }

    public void setEndereco(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
