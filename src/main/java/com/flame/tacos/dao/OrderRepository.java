package com.flame.tacos.dao;

import com.flame.tacos.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
    List<Order> findByZip(String zip);
}
