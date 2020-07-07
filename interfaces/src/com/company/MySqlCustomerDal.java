package com.company;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void Add() {
        System.out.println("Data added to the Mysql DB");
    }
}
