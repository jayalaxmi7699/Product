package com.demo.Employee.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Employee.Entity.Employee;
import com.demo.Employee.Utility.Address;
import com.demo.Employee.Utility.EmployeeUtility;
@RestController
public class EmployeeController {
	
	@PostMapping("/create")
	public Employee createEmployee() {
		return createEmployee();
	}
	
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		List<Employee> emplist=EmployeeUtility.getAllEmployees();
         return emplist;
	}
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		List<Employee> emplist=EmployeeUtility.getAllEmployees();
		for(Employee emp:emplist) {
			if(emp.getEmpid()==id) {
				return emp;
			}
		}
         return new Employee();
	}
	@GetMapping("/getByEmployee/{name}")
	public Employee getEmployee(@PathVariable String name) {
		List<Employee> emplist=EmployeeUtility.getAllEmployees();
		for(Employee emp:emplist) {
			if(emp.getFirstName().equalsIgnoreCase(name)) {
				return emp;
			}}
			return new Employee();
		}
	
	@GetMapping("/getEmployeeByNameorID/{name}/{id}")
	public Employee getEmployeeByNameorID(@PathVariable String name, @PathVariable int id) {
		List<Employee> emplist=EmployeeUtility.getAllEmployees();
		for(Employee emp:emplist) {
			if(emp.getFirstName().equalsIgnoreCase(name) || emp.getEmpid() == id) {
				return emp;
			}}
			return new Employee();
		}
	 @GetMapping("/getEmployeecount")
		public int getEmployeecount() {
	    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
	    	int count=0;
	    	for(Employee emp:emplist) {
	    		count ++;
	    	}
			return count;	
		}
	
	@GetMapping("/getAllEmployeebasedongender/{gender}")
	public List<Employee> getAllEmployeebasedongender(@PathVariable String gender) {
		List<Employee> emplist=EmployeeUtility.getAllEmployees();
		List<Employee> result=new ArrayList();
		
		for(Employee emp:emplist) {
			if(emp.getGender() !=null&&emp.getGender().equalsIgnoreCase(gender)) {
				result.add(emp);
			}
		}
		return result;
	}
    @GetMapping("/getEmployeecountbasedongender/{gender}")
	public int getEmployeecountbasedongender(@PathVariable String gender) {
    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
    	int count=0;
    	for(Employee emp:emplist) {
    		if(emp.getGender() !=null && emp.getGender().equalsIgnoreCase(gender))
    		count ++;
    	}
		return count;
	}
    @GetMapping("/getEmployeewithlocation/{location}")
    public List<Employee> getEmployeewithlocation(@PathVariable String location) {
    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
    	List<Employee> result=new ArrayList<>();
    	for(Employee emp:emplist) {
    		List<Address> addlist =emp.getaddress();
    		if(addlist !=null) {
    			for(Address add:addlist) {
    				if(add.getLocation()!=null && add.getLocation().equalsIgnoreCase(location)) {
    					result.add(emp);
    				}
        		}
    		}
    	}
		return result;
    }
    @GetMapping("/getEmployeehasaddress")
    public List<Employee> getEmployeehasaddress() {
    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
    	List<Employee> result=new ArrayList();
    	for(Employee emp:emplist) {
           if(emp.getaddress()!=null) {
        	   result.add(emp); 
           }
    	}
		return result;
		}
    
    @DeleteMapping("/deleteEmployeById/{id}")
    public Employee deleteEmployeById(@PathVariable int id) {
    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
    	for(Employee emp:emplist) {
    		if(emp.getEmpid() == id) {
    			return emp;
    		}
    	}
		return new Employee();
    }
    
    @DeleteMapping("/deleteEmployeByName/{firstName}")
    public Employee deleteEmployeByName(@PathVariable String firstName) {
    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
    	for(Employee emp:emplist) {
    		if(emp.getFirstName().equalsIgnoreCase(firstName)) {
    			return emp;
    		}
    	}
		return new Employee();
    }
    @DeleteMapping("/deleteEmployeByNameandId/{firstName}/{id}")
    public Employee deleteEmployeByNameandId(@PathVariable String firstName, @PathVariable int id) {
    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
    	for(Employee emp:emplist) {
    		if(emp.getFirstName().equalsIgnoreCase(firstName) || emp.getEmpid()== id) {
    			return emp;
    		}
    	}
		return new Employee();
    }
    @PutMapping("/UpdateEmployeById/{id}/{firstName}")
    public Employee UpdateEmployeById(@PathVariable int id, @PathVariable String firstName) {
    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
    	for(Employee emp:emplist) {
    		if(emp.getEmpid() == id) {
    			emp.setFirstName(firstName);
    			return emp;
    		}
    	}
		return new Employee();
    }
    
//    public String updateEmployee(Employee employee) {
//    	List<Employee> emplist=EmployeeUtility.getAllEmployees();
//    	for(Employee emp:emplist) {
//    		if(emp.getEmpid() == employee.getEmpid()) {
//    			emp.setFirstName(first);
//    		}
 //   }
    
    
    
    
    
    
    
    
    
}
