package org.iiitb.service;

import org.iiitb.bean.Domain;
import org.iiitb.dao.DomainDao;

import java.util.List;

public interface DomainService {
    
    DomainDao domainDao = new DomainDao();
    
    void save(Domain domain);
    
    Domain find(Integer id);
    
    Domain findByCode(String code);
    
    List<Domain> findAll();
    
}
