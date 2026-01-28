package com.roman3455.toysmart.service.impl;

import com.roman3455.toysmart.dto.ProductDto;
import com.roman3455.toysmart.entity.Product;
import com.roman3455.toysmart.repository.ProductRepository;
import com.roman3455.toysmart.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map(this::mapToDto).toList();
    }

    private ProductDto mapToDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

}
