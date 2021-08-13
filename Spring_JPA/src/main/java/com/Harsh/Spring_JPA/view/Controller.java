package com.Harsh.Spring_JPA.view;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Harsh.Spring_JPA.business.StudentService;
import com.Harsh.Spring_JPA.data.Stud;

@RestController
public class Controller {
	@Autowired
	StudentService studentService;
	@GetMapping("/findAll")
	public List<Stud> findAll(){
		return studentService.getAll();
	}
	@GetMapping("/find/{id}")
	public Optional<Stud> find(@PathVariable("id") int id){
		Optional<Stud> m = studentService.find(id);
		return m;
	}
	@PostMapping("/add")
	public Stud add(@RequestBody Stud stud) {
		studentService.add(stud);
		return stud;
	}
	@PutMapping("/update")
	public Stud update(@RequestBody Stud stud) {
		studentService.update(stud);
		return stud;
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		studentService.delete(id);
		return "done";
	}
}
