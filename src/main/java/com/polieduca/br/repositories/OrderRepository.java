package com.polieduca.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polieduca.br.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
