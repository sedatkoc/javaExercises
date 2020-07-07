package com.company;

public class CustomerManager { // business layer for all the operations
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal =customerDal;
    }
    public void Add(){
        customerDal.Add();
    }
}
