/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean.veiculo;

import com.jms.dacmotos.model.Veiculo;
import com.jms.dacmotos.suport.VeiculoSuport;
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
public class PesquisaVeiculoBean implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    private String campoPesquisa;
    private Veiculo veiculoSelecionado;
    private List<Veiculo> veiculos;
    
     private CadastroVeiculoBean cadVel;
    
    private VeiculoSuport suport;

    public PesquisaVeiculoBean() {
        this.veiculos = new ArrayList<>();
       
        suport = new VeiculoSuport();
      //  cadVel = new CadastroVeiculoBean();
        
    }

    
//    get sets
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public void editar(){
        System.err.println("Pas");
        cadVel.setVeiculo(veiculoSelecionado);
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void listarTodos(){
        veiculos = suport.list();
    }

    

    public VeiculoSuport getSuport() {
        return suport;
    }

    public void setSuport(VeiculoSuport suport) {
        this.suport = suport;
    }

    public Veiculo getVeiculoSelecionado() {
        return veiculoSelecionado;
    }

    public void setVeiculoSelecionado(Veiculo veiculoSelecionado) {
        this.veiculoSelecionado = veiculoSelecionado;
    }

    public String getCampoPesquisa() {
        return campoPesquisa;
    }

    public void setCampoPesquisa(String campoPesquisa) {
        this.campoPesquisa = campoPesquisa;
    }
    
    
    
}
