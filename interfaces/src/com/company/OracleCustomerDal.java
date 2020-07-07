package com.company;

public class OracleCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void Add() {
        System.out.println("Data added to the Oracle DB");
    }
}
