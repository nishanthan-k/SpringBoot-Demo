package com.nishanthan.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nishanthan.ecom.model.Product;
import com.nishanthan.ecom.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

  @Autowired
  private ProductService service;

  @GetMapping("/")
  public String greet() {
    return "Hello !!!!!";
  }

  @GetMapping("/products")
  public List<Product> products() {
    return service.getAllProducts();
  }
}
