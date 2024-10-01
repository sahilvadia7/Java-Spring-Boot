package com.reactspring.shoppingmall.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	public Product(int i) {
		this.id=id;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String description;
	private String brand;
	private BigDecimal price;
	private String cetegory;
	
	@JsonFormat(shape =  JsonFormat.Shape.STRING, pattern= "yyyy-mm-dd")
	private Date releaseDate;
	private boolean productAvailable;
	private int stockQuantity;
	
//	Convert image to text 
//	store the data into byte stream 
//	Lob for large data
	
	private String imageName;
	private String imgaeType;
	
	@Lob
	private byte[] imageData;

	
	
	
}
