package com.Harsh.Spring_JPA.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Stud")
@Table(name="Stud")
public class Stud {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	
	public Stud() {
		this.id = 2;
		this.name="rrr";
	}
	public Stud(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + "]";
	}
	

}
