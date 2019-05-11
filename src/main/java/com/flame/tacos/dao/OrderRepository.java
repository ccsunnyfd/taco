package com.flame.tacos.dao;

import com.flame.tacos.entity.Order;

public interface OrderRepository {
    Order save(Order order);
}
