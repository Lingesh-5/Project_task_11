package com.example.projectTask12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.projectTask12.models.Product;
import com.example.projectTask12.services.ProductService;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/products")
public class WebController {

    @Autowired ProductService productService;

    @GetMapping()
    public String showIndex() {
        return "index.html";
    }

    @GetMapping("/form")
    public String showForm() {
        return "product-form.html";
    }

    @GetMapping("/display")
    public String showProduct(Model model) {
        List<Product> products = new ArrayList<>();
        products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product-display.html";
    }
    
    @PostMapping("/create")
    public String createMethod(@ModelAttribute Product product) {
        productService.createProduct(product);     
        return "redirect:/products/form";
    }
    
    
    
    
}
