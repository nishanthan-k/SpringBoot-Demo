package com.nishanthan.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishanthan.ecom.model.Product;
import com.nishanthan.ecom.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProduct(int id) {
        // return empty product(null) if no product found with that id
        return repo.findById(id).orElse(new Product());
    }
}
