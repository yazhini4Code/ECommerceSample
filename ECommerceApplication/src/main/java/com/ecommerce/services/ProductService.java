package com.ecommerce.services;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
}
