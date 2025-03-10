package com.ecommerce.controllers;

import com.ecommerce.models.Product;
import com.ecommerce.models.Feedback;
import com.ecommerce.services.ProductService;
import com.ecommerce.services.FeedbackService;
import com.ecommerce.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/dashboard")
    public String adminDashboard(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("feedbacks", feedbackService.getAllFeedback());
        model.addAttribute("orders", orderService.getAllOrders());
        return "admin-dashboard";
    }

    @GetMapping("/Product")
    public String addProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/admin/dashboard";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "redirect:/admin/dashboard";
    }
}
