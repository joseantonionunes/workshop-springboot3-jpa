package com.aprendendospring.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.treino.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
