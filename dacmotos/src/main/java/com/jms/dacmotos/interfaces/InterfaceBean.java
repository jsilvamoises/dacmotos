/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.interfaces;

import java.util.List;

/**
 *
 * @author Moises
 * @param <T>
 */
public interface InterfaceBean {
    public void save();
    public void delete();
    public void clear();
    public void edit();
    public void refresh();
    public List listAllObjects();
}
