package com.kelly.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
        System.out.println("diff:"+ diff);
        //switch ()

        /* (start == Station.TAIPEI_STATION) {
            if (destination == Station.TAICHUNG_STATION) {
                price = 600;
            } else {
                price = 1500;
            }
            if (destination == Station.KAOHSIUNG_STATION) {
                price = 900;
            } else {
                price = 1500;
            }
            if (destination == Station.TAIPEI_STATION) {
                price = 600;
            } else {
                price = 900;
            }
        }*/
    }
    public void print(){
       // taipeiStation = 105;
        System.out.println(start.name + "\t" + destination.name +"\t" + price);
    }
}
