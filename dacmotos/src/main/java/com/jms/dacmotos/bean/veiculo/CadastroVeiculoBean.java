/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean.veiculo;

import com.jms.dacmotos.interfaces.InterfaceBean;
import com.jms.dacmotos.model.Veiculo;
import com.jms.dacmotos.suport.VeiculoSuport;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ViewScoped
public class CadastroVeiculoBean implements InterfaceBean , Serializable{
    private static final Long serialVersionUID =1L;
    private VeiculoSuport suport;
    private Veiculo veiculo;
    
   
    

    public CadastroVeiculoBean() {
        this.suport = new VeiculoSuport();
        veiculo = new Veiculo();
        
    }
    
    @PostConstruct
    public void init(){
        
    }
    

    @Override
    public void save() {
        if(suport.saveOrUpdate(veiculo)){
            clear();
        }
    }

    @Override
    public void delete() {
        if(suport.delete(veiculo)){
            clear();
        }
    }
    
    @Override
    public void clear() {
        veiculo = new Veiculo();
    }

    @Override
    public void edit() {
        
    }

    @Override
    public void update() {
        if(suport.saveOrUpdate(veiculo)){
            clear();
        }
    }

    @Override
    public List list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //metodos gets sets

    public VeiculoSuport getSuport() {
        return suport;
    }

    public void setSuport(VeiculoSuport suport) {
        this.suport = suport;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        System.out.println("Setando veiculo");
        if(veiculo!=null)
        this.veiculo = veiculo;
    }


    
    
    
}
