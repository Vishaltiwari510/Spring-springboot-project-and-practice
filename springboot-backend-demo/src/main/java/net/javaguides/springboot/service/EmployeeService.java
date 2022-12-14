package net.javaguides.springboot.service;


import java.util.List;
import java.util.Optional;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
  Employee saveEmployee(Employee employee);
  List<Employee> getAllEmployee();
  Optional<Employee> getEmployeeById(long id);
  Employee UpdateEmployee(Employee employee, long id);
  boolean deleteEmployee(long id);

}
