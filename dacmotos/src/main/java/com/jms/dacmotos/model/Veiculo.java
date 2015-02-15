/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import com.jms.dacmotos.enums.TipoCombustivel;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_veiculo")
public class Veiculo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vei_id")
    
    private Long id;
    
    @Column(name = "vei_placa", length = 8, nullable = false,unique =true )
    private String placa;
    
    @Column(name = "vei_ano_fabricacao")//verificar se pode nulo
    private int anoFabricacao;
    
    @Column(name = "vei_ano_modelo")//verificar se pode nulo
    private int anoModelo;
    
    @Column(name = "vei_renavam" , length = 12, nullable = false)
    private String renavam;
    
    @Column(name = "vei_tipo_combustivel")
    @Enumerated(EnumType.STRING)
    private TipoCombustivel tipoCombustivel;
    
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "vco_id")
    @ForeignKey(name = "FK_VEICULO_COR")
    private VeiculoCor veiculoCor;

    public Veiculo() {
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public VeiculoCor getVeiculoCor() {
        return veiculoCor;
    }

    public void setVeiculoCor(VeiculoCor veiculoCor) {
        this.veiculoCor = veiculoCor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return id.toString();
    }
    
    
    
    
}
