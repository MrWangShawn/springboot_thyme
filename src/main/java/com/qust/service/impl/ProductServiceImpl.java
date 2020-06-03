package com.qust.service.impl;

import com.qust.entity.Product;
import com.qust.mapper.ProductMapper;
import com.qust.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> productList() {
        return productMapper.products();
    }
}
