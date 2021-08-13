package com.Harsh.Spring_JPA.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Harsh.Spring_JPA.data.Stud;

public interface StudentRepositry extends JpaRepository<Stud,Integer>{

}
