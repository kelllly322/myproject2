package com.kelly;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Benny", "Jack", "Karen", "Hank", "Elene"};
        int[] english = {70, 80, 65, 75, 90};
        int[] maths = {40, 50, 70, 55, 35};
        for (int i = 0; i < 5; i++) {
            if (i != 3) {
                System.out.println(names[i] + "\t" + english[i] + "\t" + maths[i] + "\t" + (maths[i] + english[i]) / 2);
            }

        }
    }
}
