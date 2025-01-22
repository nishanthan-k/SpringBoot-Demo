package com.nishanthan.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nishanthan.ecom.model.Product;
import com.nishanthan.ecom.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

  @Autowired
  private ProductService service;

  @GetMapping("/")
  public String greet() {
    return "Hello !!!!!";
  }

  @GetMapping("/products")
  public ResponseEntity<List<Product>> products() {
    return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
  }

  @GetMapping("/product/{id}")
  public ResponseEntity<Product> productById(@PathVariable int id) {
    Product product = service.getProduct(id);

    if (product != null) {
      return new ResponseEntity<>(product, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
