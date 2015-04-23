/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.suport;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Endereco;
import java.io.Serializable;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author MOISES
 */
public class EnderecoSuport implements Serializable {
    private InterfaceDao<Endereco> Dao() {
        InterfaceDao<Endereco> dao = new Dao<>(Endereco.class);
        return dao;
    }
    
    
    public Endereco getEnderecoByCep(String cep, String numero){
        DetachedCriteria criteria = DetachedCriteria.forClass(Endereco.class);
        criteria.add(Restrictions.ilike("cep", cep.replace(".", "").replace("-", "")));
        criteria.add(Restrictions.ilike("numero", cep.replace(".", "").replace("-", "")));
        return Dao().getEntityByDetachedCriteria(criteria);
                
    }
    
}
