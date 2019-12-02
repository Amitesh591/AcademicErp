package org.iiitb.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.iiitb.bean.Domain;
import org.iiitb.util.SessionUtil;

import java.util.List;

public class DomainDao {
    public void save(Domain domain) {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(domain);
        
        transaction.commit();
        session.close();
    }
    
    public Domain find(Integer id) {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();
        
        Domain domain = session.get(Domain.class, id);
        
        transaction.commit();
        session.close();
        return domain;
    }
    
    public Domain findByCode(String code) {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();
        
        String hql = "FROM Domain WHERE code = :code";
        Query query = session.createQuery(hql);
        query.setParameter("code", code);
        Domain domain = (Domain) query.getSingleResult();
        
        transaction.commit();
        session.close();
        return domain;
    }
    
    public List<Domain> findAll() {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();
        
        String hql = "FROM Domain";
        Query query = session.createQuery(hql);
        
        List<Domain> domains = query.list();
        
        transaction.commit();
        session.close();
        
        return domains;
    }
}
