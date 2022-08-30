package abhi.sb.response.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import abhi.sb.response.entity.Employee;
import abhi.sb.response.entity.ResponseData;

/*
 * For Logging ==> Lombok
// At class level ==> @slf4j   + in d method ==> log.info("Custom Message");
 */
@RestController
public class ControllerClass {

	@GetMapping("/withoutReturningAnyObj")
	public void authorName1() {
		System.out.println("Abhilash");
	}
	
	
	@GetMapping("/returningStringObj")
	public String authorName2() {
		return "Abhilash";
	}

	
	@GetMapping("/returningResponseEntityAndStringObj")
	public ResponseEntity<String> returningResponseEntityObj() {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Abhilash", HttpStatus.OK);
		//HttpStatus.OK ==> always last.
		return responseEntity;
	}
	
	
	@GetMapping("/returningEmployeeZeroArgObj")
	public Employee returningEmployeeZeroArgObj() {
		return new Employee();
	}
	
	
	@GetMapping("/returningEmployeeArgObj")
	public Employee returningEmployeeArgObj() {
		return new Employee(12, "abhi",10000);
	}
	

	@GetMapping("/returningEmployeeList")
	public List<Employee> returningEmployeeList() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "nani", 1000));
		list.add(new Employee(2, "gani", 2000));
		list.add(new Employee(3, "soni", 3000));
		return list;
	}
	
	
	@GetMapping("/returningResponseEntityAndEmployeeObj")
	public ResponseEntity<Employee> returningResponseEntityAndEmployeeObj() {
		return new ResponseEntity<Employee>(new Employee(15, "jani", 2300), HttpStatus.OK);
		//HttpStatus.OK ==> always last.
	}
	
	
	@GetMapping("/returningResponseEntityWithResponseHeaders")
	public ResponseEntity<ResponseData> returningResponseEntityWithResponseHeaders() {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "nani", 1000));
		list.add(new Employee(2, "gani", 2000));
		list.add(new Employee(3, "soni", 3000));
		
		ResponseEntity<ResponseData> responseEntity = null;
		
		if(list != null) {
			
			Date date = new Date();
			ResponseData responseData = new ResponseData(date, HttpsURLConnection.HTTP_CREATED, "Sucess", "List is Created", list);
			responseEntity = new ResponseEntity<ResponseData>(responseData, HttpStatus.ACCEPTED);
		}
		return responseEntity;
	}
}

//	http://localhost:8080/withoutReturningAnyObj
//	http://localhost:8080/returningStringObj
//	http://localhost:8080/returningResponseEntityAndStringObj
//	http://localhost:8080/returningEmployeeZeroArgObj
//	http://localhost:8080/returningEmployeeArgObj
//	http://localhost:8080/requiredAnnotaionEx
//	http://localhost:8080/returningEmployeeList
//	http://localhost:8080/returningResponseEntityAndEmployeeObj
//	http://localhost:8080/returningResponseEntityWithResponseHeaders


//@GetMapping("/requiredAnnotaionEx")
//public Employee requiredAnnotaionEx() {
//	return new Employee(12, "abhi");
//}







