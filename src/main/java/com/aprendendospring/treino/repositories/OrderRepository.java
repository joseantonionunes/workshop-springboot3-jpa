package com.aprendendospring.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.treino.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
