package net.java.springboot.crudrestfulapi.controller;

import net.java.springboot.crudrestfulapi.dao.EmployeeDao;
import net.java.springboot.crudrestfulapi.model.Employee;
import net.java.springboot.crudrestfulapi.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping ("/employees")
    public List<Employee> getAllEmployees () {

        return employeeDao.findAll ();
    }

    @GetMapping ("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable (value = "id") Integer employeeId) throws ResourceNotFoundException {

        Optional<Employee> optional = employeeDao.findById (employeeId);
        if (!optional.isPresent ()) {
            return ResponseEntity.notFound ().build ();
        }

        Employee employee = optional.get ();
        return ResponseEntity.ok ().body (employee);
    }

    @PostMapping ("/employees")
    public Employee createEmployee (@Valid @RequestBody Employee employee) {

        return employeeDao.save (employee);
    }

    @PutMapping ("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee (@PathVariable (value = "id") Integer employeeId, @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {

        Optional<Employee> optional = employeeDao.findById (employeeId);
        if (!optional.isPresent ()) {
            return ResponseEntity.notFound ().build ();
        }

        Employee employee = optional.get ();
        employee.setName (employeeDetails.getName ());
        employee.setEmailId (employeeDetails.getEmailId ());
        final Employee updatedEmployee = employeeDao.save (employee);
        return ResponseEntity.ok ().body (updatedEmployee);
    }

    @DeleteMapping ("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployee (@PathVariable (value = "id") Integer employeeId) throws ResourceNotFoundException {

        Optional<Employee> optional = employeeDao.findById (employeeId);
        if (!optional.isPresent ()) {
            return ResponseEntity.notFound ().build ();
        }

        Employee employee = optional.get ();
        employeeDao.delete (employee);
        return ResponseEntity.ok ().build ();
    }

}