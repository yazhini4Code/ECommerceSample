package com.ecommerce.controllers;

import com.ecommerce.models.Feedback;
import com.ecommerce.models.Product;
import com.ecommerce.services.ProductService;
import com.ecommerce.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ProductService productService;

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/dashboard")
    public String customerDashboard(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "customer-dashboard";
    }

    @GetMapping("/feedback/{productId}")
    public String feedbackForm(@PathVariable int productId, Model model) {
        model.addAttribute("feedback", new Feedback());
        model.addAttribute("productId", productId);
        return "feedback";
    }

    @PostMapping("/feedback/{productId}")
    public String submitFeedback(@PathVariable int productId, @ModelAttribute Feedback feedback) {
        feedbackService.addFeedback(productId, feedback);
        return "redirect:/customer/dashboard";
    }
}
