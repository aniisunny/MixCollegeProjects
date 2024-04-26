package net.java.springboot.crudrestfulapi.repository;

import net.java.springboot.crudrestfulapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
