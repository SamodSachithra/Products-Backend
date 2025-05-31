package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Service;

@Service

public class ProductService {

    public void createProduct(Product product){
        double taxAmount = (product.getPrice()/100)*20;

        double sellingPrice = product.getPrice() + taxAmount;

        //DB insert
    }
}
