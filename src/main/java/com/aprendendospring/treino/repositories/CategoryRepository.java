package com.aprendendospring.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.treino.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
