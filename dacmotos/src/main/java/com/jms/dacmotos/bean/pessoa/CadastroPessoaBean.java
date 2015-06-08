/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean.pessoa;

import com.jms.dacmotos.model.Endereco;
import com.jms.dacmotos.model.Pessoa;
import com.jms.dacmotos.suport.PessoaSuport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ViewScoped
public class CadastroPessoaBean implements Serializable {
    private static final Long serialVersionUID = 1L;

    private Pessoa pessoa;
 
   
    private PessoaSuport suport;
    

    public CadastroPessoaBean() {
       init();
    }

    

    //cria todos os objetos da classe
    private void init() {
        this.pessoa = new Pessoa();     
       
        this.suport = new PessoaSuport();
       

    }

    //salva o objeto
    public void save() {
        try {
          
           if( suport.save(pessoa)){
                 limpar();
           }
          
        } catch (Exception e) {
        }

    }

    //salva ou atualiza

    public void saveOrUpdate() {
        try {
            if(suport.saveOrUpadate(pessoa)){
                limpar();
            }
            
            
        } catch (Exception e) {
        }
    }

    public void delete() {
        suport.save(pessoa);
    }

   

    public void limpar() {
        init();
    }
    
    

    //METODOS GET E SETS
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
       System.out.print("Passou no set pessoa");
//        if(pessoa.getId()!=null){
//            this.pessoa = suport.getPessoaById(pessoa.getId());
//        }
       if(pessoa!=null)
        this.pessoa = pessoa;
    }

    
   

    public PessoaSuport getSuport() {
        return suport;
    }

    public void setSuport(PessoaSuport suport) {
        this.suport = suport;
    }

    public Pessoa getPessoaById(Long id) {
        System.out.print("X");
        return suport.getPessoaById(id);
    }

}
