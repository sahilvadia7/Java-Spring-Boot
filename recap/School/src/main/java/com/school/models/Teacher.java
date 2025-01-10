package com.school.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String subject;
	
    @OneToMany(mappedBy = "teacher")
	private Set<Classs> setassignedClasses;
	
	
	public Teacher() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public Set<Classs> getSetassignedClasses() {
		return setassignedClasses;
	}


	public void setSetassignedClasses(Set<Classs> setassignedClasses) {
		this.setassignedClasses = setassignedClasses;
	}


	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", email=" + email + ", subject=" + subject
				+ ", setassignedClasses=" + setassignedClasses + "]";
	}



	
	
	
	
}
