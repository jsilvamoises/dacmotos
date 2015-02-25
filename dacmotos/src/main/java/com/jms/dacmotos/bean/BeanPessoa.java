/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;


import com.jms.dacmotos.enums.TipoPessoa;
import com.jms.dacmotos.interfaces.InterfaceBean;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Endereco;
import com.jms.dacmotos.model.Pessoa;
import com.jms.dacmotos.util.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import com.jms.dacmotos.dao.Dao;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Moises
 */
@ManagedBean(name = "beanPessoa")
@SessionScoped
public class BeanPessoa implements Serializable, InterfaceBean{
    private static final Long SerialVersionUID  = 1L;
    private String tpPessoa="";
    private String cepString;
    private Pessoa pessoa;
    private Endereco endereco;
    private BeanCep benCep;
    

    /**
     * Creates a new instance of BeanPessoa
     */
    public BeanPessoa() {
        pessoa = new Pessoa();
       endereco = new Endereco();
        benCep = new BeanCep();
        System.out.println("54");        
    }
    
    public void pesquisar(){
       
        endereco = benCep.getEnderecoByCep(cepString);
        if(endereco.getBairro().isEmpty()){
            System.out.println(endereco);
           // pessoa.getEnderecos().add(endereco);
           FacesUtil.addInfoMessage("Informe o endereço manualmente, não foi possível encontrar.");
        }else{
              FacesUtil.addWarnMessage("Endereço encontrado");
           
        }
    }
    
    public TipoPessoa[] tipos(){
        return TipoPessoa.values();
    }
    
    public boolean verificaSeExisteUmTipoPessoaSelecionado(){
        return !tpPessoa.isEmpty();
    }

    public String getTipoPessoa() {
        return tpPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tpPessoa = tipoPessoa;
    }

    public String getTpPessoa() {
        return tpPessoa;
    }

    public void setTpPessoa(String tpPessoa) {
        this.tpPessoa = tpPessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public BeanCep getBenCep() {
        return benCep;
    }

    public void setBenCep(BeanCep benCep) {
        this.benCep = benCep;
    }

    public String getCepString() {
        return cepString;
    }

    public void setCepString(String cepString) {
        this.cepString = cepString;
    }
    
    private InterfaceDao<Pessoa> Dao(){
        InterfaceDao<Pessoa> marcaDao = new Dao<>(Pessoa.class);
        return marcaDao;
    }

    @Override
    public void save() {
        
        
       // endereco.getPessoas().add(pessoa);
        pessoa.getEnderecos().add(endereco);
        if(Dao().save(pessoa)){
            
            pessoa= new Pessoa();
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
    public void refresh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAllObjects() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
