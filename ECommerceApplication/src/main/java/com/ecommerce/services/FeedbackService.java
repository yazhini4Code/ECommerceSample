package com.ecommerce.services;

import com.ecommerce.dao.FeedbackDAO;
import com.ecommerce.models.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackDAO feedbackDAO;

    public void addFeedback(int productId, Feedback feedback) {
        feedbackDAO.addFeedback(feedback);
    }

    public List<Feedback> getAllFeedback() {
        return feedbackDAO.getAllFeedback();
    }
}
