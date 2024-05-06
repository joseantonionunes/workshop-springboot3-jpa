package com.aprendendospring.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.treino.entities.OrderItem;
import com.aprendendospring.treino.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
