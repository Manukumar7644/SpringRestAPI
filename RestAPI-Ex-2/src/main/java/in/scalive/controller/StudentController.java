package in.scalive.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import in.scalive.model.ErrorResponse;
import in.scalive.model.Student;

@RestController
@RequestMapping(value="/api")
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		Student s=new Student(101,"Karan",56.7);
		return s;
		
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student>studList=List.of(new Student(101,"Karan",56.7),new Student(102,"Ravi",86.7),new Student(103,"Deepesh",87.7));
		return studList;
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<?> getStudent(@PathVariable Integer id){
		Map<Integer,Student>studMap=Map.of(101,new Student(101,"Karan",56.7),102,new Student(102,"Ravi",86.7),103,new Student(103,"Deepesh",87.7));
		Student s=studMap.get(id);
		if(s==null) {
			ErrorResponse error=new ErrorResponse(HttpStatus.NOT_FOUND.value(),"Student with id "+id+" not found!");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		}
		return ResponseEntity.ok(s);
	}
}
