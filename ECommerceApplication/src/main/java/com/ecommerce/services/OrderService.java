package com.ecommerce.services;

import com.ecommerce.dao.OrderDAO;
import com.ecommerce.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDAO orderDAO;

    public List<Order> getAllOrders() {
        return orderDAO.getAllOrders();
    }
}
