package com.tregulov.spring.springboot.springboot_rest.service;

import com.tregulov.spring.springboot.springboot_rest.dao.EmployeeDAO;
import com.tregulov.spring.springboot.springboot_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDAO.saveEmployee(employee);
//    }
//
//    @Override
//    @Transactional
//    public Employee getEmployee(int id) {
//        Employee employee = employeeDAO.getEmployee(id);
//        return employee;
//    }
//
//    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        employeeDAO.deleteEmployee(id);
//    }
}
