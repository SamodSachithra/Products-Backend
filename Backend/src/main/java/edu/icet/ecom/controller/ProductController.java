package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/create-product")
    Product createProduct(@RequestBody Product product){
        System.out.println(product);
        service.createProduct(product);
        return product;
    }

}
