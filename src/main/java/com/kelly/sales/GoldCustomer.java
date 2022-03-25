package com.kelly.sales;

public class GoldCustomer extends SilverCustomer {
    public GoldCustomer(String id, int amount){
        super(id,amount);
        float off = 0.2f;
    }
}
