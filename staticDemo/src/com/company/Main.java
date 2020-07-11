package com.company;

public class Main {

    public static void main(String[] args) {
	    ProductManager manager = new ProductManager();
	    Product product = new Product();
	    product.name="mouse";
	    product.price=20;

	    manager.add(product);

	    //inner class example

		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.delete();
    }
}
