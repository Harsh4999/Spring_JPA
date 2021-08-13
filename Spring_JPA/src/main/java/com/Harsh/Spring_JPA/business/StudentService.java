package com.Harsh.Spring_JPA.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Harsh.Spring_JPA.data.Stud;
import com.Harsh.Spring_JPA.repositry.StudentRepositry;
@Service
public class StudentService {
	@Autowired
	StudentRepositry studRepositry;
	public List<Stud> getAll(){
		return studRepositry.findAll();
	}
	public Optional<Stud> find(int id){
		return studRepositry.findById(id);
	}
	public void add(Stud stud) {
		studRepositry.save(stud);
	}
	public void update(Stud stud) {
		studRepositry.save(stud);
	}
	public void delete(int id) {
		studRepositry.deleteById(id);
	}
}
