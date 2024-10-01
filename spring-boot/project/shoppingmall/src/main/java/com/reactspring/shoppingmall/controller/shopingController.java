package com.reactspring.shoppingmall.controller;

import java.io.IOException;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.reactspring.shoppingmall.model.Product;
import com.reactspring.shoppingmall.service.ProductService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class shopingController {
	
	
	@Autowired
	ProductService service;
	
	@PostMapping("/load")
	public String loadProduct() {
		service.load();
		return "Success";
	}

	
	@GetMapping("products")
	public ResponseEntity<List<Product>> getAllProduct(){
		return new ResponseEntity<>(service.getAllProduct(),HttpStatus.OK);		
	}
	
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id){
		 Product product = (Product) service.getProductById(id);
		 
		if(product != null  ) {
			return new ResponseEntity<>(product,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PostMapping("/product")
	public ResponseEntity<?> addProduct(@RequestPart Product product,@RequestPart MultipartFile image){
		try {
		Product savedProduct = service.addProduct(product,image);
		return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
		}catch(IOException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
					}
	}
	
}
