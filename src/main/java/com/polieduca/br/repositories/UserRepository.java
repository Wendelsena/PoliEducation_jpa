package com.polieduca.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polieduca.br.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
