/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.beanx;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import org.jsoup.Connection;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ViewScoped
public class BeanGerarRelatorio {
    @Inject
    private Connection conn;
    public static void main(String[] args) {
        BeanGerarRelatorio gbr;
    }
    
}
