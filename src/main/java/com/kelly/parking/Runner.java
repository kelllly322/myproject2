package com.kelly.parking;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "8:00";
        String exitTime = "11:00";
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        Date d2 = new Date();
        long ms = 3*60*60*1000;
        System.out.println(d2);
        System.out.println(d2.getTime());
    }
}
