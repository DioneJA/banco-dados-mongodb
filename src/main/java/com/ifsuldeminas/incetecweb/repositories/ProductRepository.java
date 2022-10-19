package com.ifsuldeminas.incetecweb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ifsuldeminas.incetecweb.entities.Product;

public interface ProductRepository extends MongoRepository<Product,String>{
}
