package com.qust.controller;

import com.qust.entity.Product;
import com.qust.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/list")
    public String product(Model model){
        List<Product> products = productService.productList();
        System.out.println(products);
        model.addAttribute("products",products);
        return "product";
    }

}
