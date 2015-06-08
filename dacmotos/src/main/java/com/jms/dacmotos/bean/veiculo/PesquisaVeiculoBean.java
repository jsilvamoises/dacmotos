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
public class PesquisaVeiculoBean implements Serializable {

    private static final Long serialVersionUID = 1L;

    private String campoPesquisa;
    private Veiculo veiculo;
    private List<Veiculo> veiculos;

    private VeiculoSuport suport;

    public PesquisaVeiculoBean() {
        this.veiculos = new ArrayList<>();
        veiculo = new Veiculo();
        suport = new VeiculoSuport();

    }

    public void listarVeiculosPorPlaca() {
        if (campoPesquisa.length()>0) {
            veiculos = suport.veiculosPorPlaca(campoPesquisa);
        } else {
            veiculos = suport.list();
        }
    }

//    get sets
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void listarTodos() {
        veiculos = suport.list();
    }

    public VeiculoSuport getSuport() {
        return suport;
    }

    public void setSuport(VeiculoSuport suport) {
        this.suport = suport;
    }

    public Veiculo getVeiculoSelecionado() {
        return veiculo;
    }

    public void setVeiculoSelecionado(Veiculo veiculoSelecionado) {
        this.veiculo = veiculoSelecionado;
    }

    public String getCampoPesquisa() {
        return campoPesquisa;
    }

    public void setCampoPesquisa(String campoPesquisa) {
        this.campoPesquisa = campoPesquisa;
    }

}
