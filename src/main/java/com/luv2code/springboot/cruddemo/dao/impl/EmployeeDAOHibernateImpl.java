/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springboot.cruddemo.dao.impl;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author isaac
 */
@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
    
    private EntityManager entityManager;
    
    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    @Transactional
    public List<Employee> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
        
        List<Employee> employees = query.getResultList();
        
        return employees;
    }
    
    @Override
    @Transactional
    public Employee findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Employee employee = currentSession.get(Employee.class, id);
        
        return employee;
    }
    
    @Override
    @Transactional
    public void save(Employee employee) {
        Session currentSession = entityManager.unwrap(Session.class);
        
        currentSession.saveOrUpdate(employee);
    }
    
    @Override
    @Transactional
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query query = currentSession.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
    
}
