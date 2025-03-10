package com.ecommerce.dao;

import com.ecommerce.models.Feedback;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class FeedbackDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addFeedback(Feedback feedback) {
        sessionFactory.getCurrentSession().save(feedback);
    }

    public List<Feedback> getAllFeedback() {
        return sessionFactory.getCurrentSession().createQuery("from Feedback", Feedback.class).list();
    }
}
