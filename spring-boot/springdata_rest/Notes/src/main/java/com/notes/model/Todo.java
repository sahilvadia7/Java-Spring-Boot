package com.notes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Todo {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String Data;
	
	
	public Todo() {
		super();
	}
	
	public Todo(Long id, String data) {
		super();
		this.id = id;
		Data = data;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", Data=" + Data + "]";
	}
	
	
	
	
}
