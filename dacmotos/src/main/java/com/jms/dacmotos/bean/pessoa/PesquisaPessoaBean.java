/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean.pessoa;

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
public class PesquisaPessoaBean implements Serializable {
    private String campoPesquisa;
    private final PessoaSuport suport;
    private List<Pessoa> pessoas;
    private Pessoa pessoaSelecionada;
    
    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }
    
    
    public void listarClienteByNameDocument(){
        pessoas = suport.ListByNameOrDocument(campoPesquisa);
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    public PesquisaPessoaBean() {
        this.suport = new PessoaSuport();
        this.pessoas = new ArrayList<>();
    }
    
    
    public void listarTodos(){
        pessoas = suport.listarTodos();
    }
    
    public void bloquearCliente() {
        suport.bloquearCliente(pessoaSelecionada);
    }

    public void ativarCliente() {
       suport.ativarCliente(pessoaSelecionada);
    }
    
    public void limparLista(){
        pessoas.clear();
    }
    
    public List<Pessoa> autocomplete(String valor){
        return suport.ListByNameOrDocument(valor);
    }
    
    
    public String getDocWithNome(Pessoa pessoa){
        return pessoa.getCpfCnpj().concat(" - ").concat(pessoa.getNome());
    }
    
    

    
//    metodos gets sets

   

   

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public String getCampoPesquisa() {
        return campoPesquisa;
    }

    public void setCampoPesquisa(String campoPesquisa) {
        this.campoPesquisa = campoPesquisa;
    }
    
    
    
}
