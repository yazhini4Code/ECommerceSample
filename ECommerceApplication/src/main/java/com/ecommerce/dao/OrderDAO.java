package com.ecommerce.dao;

import com.ecommerce.models.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class OrderDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Order> getAllOrders() {
        return sessionFactory.getCurrentSession().createQuery("from Order", Order.class).list();
    }
}
