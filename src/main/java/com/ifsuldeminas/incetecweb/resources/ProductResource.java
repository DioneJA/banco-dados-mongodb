package com.ifsuldeminas.incetecweb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifsuldeminas.incetecweb.entities.Product;
import com.ifsuldeminas.incetecweb.repositories.ProductRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ProductResource {
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = new ArrayList<Product>();
		products = productRepository.findAll();
		return ResponseEntity.ok(products);
	}

}
