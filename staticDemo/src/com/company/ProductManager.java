package com.company;

public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("Data added to the DB");
        }
        else{
            System.out.println("product information is not valid");
        }
    }
}
