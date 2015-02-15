/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import com.jms.dacmotos.enums.TipoEndereco;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_endereco")
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "end_id")
    private Long id;
    
    @Column(name = "end_cep", length = 10, nullable = false,unique = true)
    private String cep;
    
    @Column(name = "end_logradouro",length = 100,nullable = false)
    private String logradouro;
    
    @Column(name = "end_bairro",length = 100,nullable = false)
    private String bairro;
    
    @Column(name = "end_cidade", length = 100, nullable = false)
    private String  cidade;
    
    @Column(name = "end_uf", length = 2, nullable = false)
    private String uf;
    
    @Column(name = "end_numero", length = 15, nullable = false)
    private String numero;
    
    @Enumerated(EnumType.STRING) 
    @Column(name = "end_tipo_endereco")
    private TipoEndereco tipoEndereco;
    
    @ManyToMany
    @ForeignKey(name = "FK_PESSOA")
    private List<Pessoa> pessoas;
    
}
