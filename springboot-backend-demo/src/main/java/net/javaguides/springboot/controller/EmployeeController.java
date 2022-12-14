package net.javaguides.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;




@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	private EmployeeService employeeservice;

	public EmployeeController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}
	
	
	// Build create employee rest api
	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmployee(@RequestBody  Employee employee){
		Employee addedEmployee =  employeeservice.saveEmployee(employee);
		if(addedEmployee.getEmail().isEmpty() || addedEmployee.getFirstName().isEmpty() || addedEmployee.getLastName().isEmpty()) {
			return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);			
		}
		else {
			return new ResponseEntity<Employee>(addedEmployee, HttpStatus.CREATED);
		}
		//return new ResponseEntity<Employee>(, HttpStatus.CREATED);
	}	
	//built get all employee REST  Api
	@GetMapping("/view")
	public ResponseEntity<List<Employee>>  getAllEmployee(){
//		return employeeservice.getAllEmployee();\
		List<Employee> allEmployee = employeeservice.getAllEmployee();
		if(allEmployee!=null) {
			return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.OK);			
		}
		else {
			return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	//built employee by id rest api
	@GetMapping("{id}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("id") long empid){
		Optional<Employee> employeeById = employeeservice.getEmployeeById(empid);
		if(employeeById!=null) {
			return new ResponseEntity<Optional<Employee>>(employeeById, HttpStatus.OK);			
		}
		else {
			return new ResponseEntity<Optional<Employee>>(HttpStatus.NOT_FOUND);
		}		
	}
	
	
	//build update employee rest api
	@PutMapping("update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeservice.UpdateEmployee(employee, id), HttpStatus.OK);
	}	
	
	//build rest api for deleting 
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){		
		if(this.employeeservice.deleteEmployee(id)) {	
		return new ResponseEntity<String>("deleted succesfully", HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("cannot be deleted", HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	
	
	
	
	
	
	
}
