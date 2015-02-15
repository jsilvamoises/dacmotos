/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_pedido")
public class Pedido implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @Column(name = "ped_id")
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
}
