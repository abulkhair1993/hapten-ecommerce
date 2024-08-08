package com.hapten.products.controller;

import com.hapten.products.entity.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {
    @GetMapping("/")
    public List<Products> getProducts() {
        Products p0 = Products.builder().productId(1).productName("LinkedIn").category("Social Media").build();
        Products p1 = Products.builder().productId(1).productName("Facebook").category("Social Media").build();
        Products p2 = Products.builder().productId(1).productName("Instagram").category("Social Media").build();
        return List.of(p0,p1,p2);

    }
}
