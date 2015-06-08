/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ViewScoped
public class BeanCalendar {
    private Calendar now;

    public Calendar getNow() {
        return Calendar.getInstance();
    }
    
}
