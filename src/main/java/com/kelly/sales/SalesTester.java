package com.kelly.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester{


       /* public static void main(String[] args) {
            Customer c1 = new Customer("0001", 1200);
            Customer c2 = new Customer("0002", 800);
            SilverCustomer c3 = new SilverCustomer("0003", 2000);
            GoldCustomer c4 = new GoldCustomer("0004", 5000);
            c1.print();
            c2.print();
            c3.print();
            c4.print();
        }
    }*/
        public static void main(String[] args) {
     List<Customer> customers = new ArrayList<>();
     customers.add(new Customer("0001", 1200));
     customers.add(new Customer("0002", 800));
     customers.add(new SilverCustomer("0003", 2000));
     customers.add(new GoldCustomer("0004", 5000));
     customers.add(new DiscountCustomer("0005", 900));
     for (int i = 0; i < 5 ; i++) {
         customers.get(i).print();
            }
     for (Customer c: customers) {
         c.print();
     }
    }
}
