package com.ecommerce.dao;

import com.ecommerce.models.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Product> getAllProducts() {
        return sessionFactory.getCurrentSession().createQuery("from Product", Product.class).list();
    }

    public void addProduct(Product product) {
        sessionFactory.getCurrentSession().save(product);
    }

    public void deleteProduct(int id) {
        Product product = sessionFactory.getCurrentSession().get(Product.class, id);
        if (product != null) {
            sessionFactory.getCurrentSession().delete(product);
        }
    }
}
