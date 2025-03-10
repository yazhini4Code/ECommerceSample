package com.ecommerce.services;

import com.ecommerce.dao.UserDAO;
import com.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
