package com.roman3455.toysmart.service.impl;

import com.roman3455.toysmart.entity.Product;
import com.roman3455.toysmart.repository.ProductRepository;
import com.roman3455.toysmart.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
