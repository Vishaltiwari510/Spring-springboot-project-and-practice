package net.javaguides.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeRepository employeerepository;
	
	
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}





	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeerepository.save(employee);
	}





	@Override
	public List<Employee> getAllEmployee() {
		
		return employeerepository.findAll();
	}





	@Override
	public Optional<Employee> getEmployeeById(long id) {
//		 Optional<Employee> employee = employeerepository.findById(id);
	
	if(employeerepository.existsById(id)) {
		return employeerepository.findById(id);
	}
	
	
	else {
		return null;
	}
	}





	@Override
	public Employee UpdateEmployee(Employee employee, long id) {
		
		//check whether employee with given id exist or not
		Employee existingEmployee = employeerepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Employee", "id", id));
		
     existingEmployee.setFirstName(employee.getFirstName());
     existingEmployee.setLastName(employee.getLastName());
	existingEmployee.setEmail(employee.getEmail());
	//save existing employee in database
	
	employeerepository.save(existingEmployee);
	
	return existingEmployee;
	
	}





	@Override
	public boolean deleteEmployee(long id) {
		
//		//check whether employee exist in a database or not
//		employeerepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "id", id));
//		
//		employeerepository.deleteById(id);
		
		if(employeerepository.existsById(id)) {
			employeerepository.deleteById(id);
			return true;
		}
		return false;	 
		
	
		
	}
	
	
	
	
	
	





}
