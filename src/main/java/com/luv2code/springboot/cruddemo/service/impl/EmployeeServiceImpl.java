/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springboot.cruddemo.service.impl;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author isaac
 */
/*@Service*/
public class EmployeeServiceImpl /*implements EmployeeService*/ {

    //private EmployeeDAO employeeDAO;
    //private EmployeeRepository employeeRepository;

    /*@Autowired
    public EmployeeServiceImpl(@Qualifier("EmployeeDAOImpl") EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }*/
    /*@Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    //@Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    //@Transactional
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee = null;

        if (result.isPresent()) {
            employee = result.get();
        }
        else{
            throw new RuntimeException("Did not find employee id - " + id);
        }
        return employee;
    }

    @Override
    //@Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    //@Transactional
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }*/

}
