package com.reactspring.shoppingmall.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.reactspring.shoppingmall.model.Product;
import com.reactspring.shoppingmall.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	

	public void load() {
		
		  List<Product> products = new ArrayList<>();
		           products.add(new Product(1, "Laptop", "High performance laptop", "Dell",new BigDecimal("15000.00"), "Electronics","2024-01-25", true, 20));
		           products.add(new Product(2, "Pixel 9", "12GB/256GB", "Google", new BigDecimal("95000.00"), "Electronics","2024-02-23", true, 2));
		           products.add(new Product(3, "iPhone 15", "128GB, Silver", "Apple", new BigDecimal("120000.00"), "Electronics", "2024-03-15", true, 10));
		           products.add(new Product(4, "Smartwatch", "Fitness tracking smartwatch", "Fitbit", new BigDecimal("18000.00"), "Wearables", "2024-04-10", true, 5));
		           products.add(new Product(5, "OLED TV", "65-inch 4K Ultra HD", "Sony", new BigDecimal("250000.00"), "Electronics", "2024-05-20", true, 8));
		           products.add(new Product(6, "Gaming Console", "Next-gen console with 1TB storage", "Microsoft", new BigDecimal("70000.00"), "Gaming", "2024-06-12", false, 0));
		           products.add(new Product(7, "Air Purifier", "Advanced filtration system", "Dyson", new BigDecimal("45000.00"), "Home Appliances", "2024-07-05", true, 15));
		           products.add(new Product(8, "Bluetooth Speaker", "Portable wireless speaker", "JBL", new BigDecimal("8500.00"), "Audio", "2024-08-18", true, 25));

		  
		repo.saveAll(products);
	}
	
	
	public List<Product> getAllProduct(){
		return repo.findAll();
	}


	public Object getProductById(Integer id) {
		return repo.findById(id).orElse(null);
	}


	public Product addProduct(Product product, MultipartFile image) throws IOException {
		
		product.setImageName(image.getOriginalFilename());
		product.setImageType(image.getContentType());
		product.setImageData(image.getBytes());
		return repo.save(product);
	}
	
}
