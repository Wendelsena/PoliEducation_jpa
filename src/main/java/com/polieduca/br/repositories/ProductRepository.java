package com.polieduca.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polieduca.br.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
