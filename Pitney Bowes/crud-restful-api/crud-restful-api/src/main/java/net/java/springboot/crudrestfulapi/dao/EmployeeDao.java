package net.java.springboot.crudrestfulapi.dao;

import net.java.springboot.crudrestfulapi.exception.ResourceNotFoundException;
import net.java.springboot.crudrestfulapi.model.Employee;
import net.java.springboot.crudrestfulapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployeeDao {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save (Employee employee) {

        return employeeRepository.save (employee);
    }

    public List<Employee> findAll () {

        return employeeRepository.findAll ();
    }

    public Optional<Employee> findById (Integer empId) {

        return employeeRepository.findById (empId);
    }

    public void delete (Employee employee) {

        employeeRepository.delete (employee);
    }
}
