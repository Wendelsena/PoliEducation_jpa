package com.polieduca.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polieduca.br.entities.OrderItem;
import com.polieduca.br.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
