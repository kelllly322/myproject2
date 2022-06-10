package com.kelly.sales;

public class DiscountCustomer extends Customer {
    public DiscountCustomer(String id, int amount) {
        super(id, amount);
    }
    public float backMoney(){
        return amount*off;
    }
}
