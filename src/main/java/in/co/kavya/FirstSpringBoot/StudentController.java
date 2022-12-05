package in.co.kavya.FirstSpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/getEmployees")
	public ResponseEntity<Object> getEmployees(){
		List<Employee> emp=new ArrayList<>();
		Employee e1=new Employee();
		e1.setAge(34);
		e1.setFname("kotholla");
		e1.setLname("mounika");
		emp.add(e1);
		Employee e2=new Employee();
		e2.setAge(56);
		e2.setFname("mamilla");
		e2.setLname("ravi");
		emp.add(e2);
		
		return new ResponseEntity<Object>(emp, HttpStatus.OK);
		
		
		
		//this method will return JSON (java script object notation)
		
	}
	
	

}
