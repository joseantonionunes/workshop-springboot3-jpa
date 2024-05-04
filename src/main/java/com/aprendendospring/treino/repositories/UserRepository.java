package com.aprendendospring.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.treino.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
