package com.polieduca.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polieduca.br.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
