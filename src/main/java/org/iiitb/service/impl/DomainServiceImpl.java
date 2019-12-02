package org.iiitb.service.impl;

import org.iiitb.bean.Domain;
import org.iiitb.service.DomainService;

import java.util.List;

public class DomainServiceImpl implements DomainService {
    
    @Override
    public void save(Domain domain) {
        domainDao.save(domain);
    }
    
    @Override
    public Domain find(Integer id) {
        return domainDao.find(id);
    }
    
    @Override
    public Domain findByCode(String code) {
        return domainDao.findByCode(code);
    }
    
    @Override
    public List<Domain> findAll() {
        return domainDao.findAll();
    }
}
