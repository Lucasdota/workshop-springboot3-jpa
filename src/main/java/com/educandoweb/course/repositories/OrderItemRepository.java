package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;

// doesn't need to create the implementation of this interface, because the 
// spring.data.jpa already does it
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
