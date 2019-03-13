package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);
        System.out.println(c.getTime());
        long day1 = c.getTimeInMillis();
        int DAY_IM = 1000 * 60 * 60 * 24;
        for (int i = 0; i < 3; i++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            System.out.println("New fullmoon in " + c.getTime());
        }
//        System.out.println("New hour " + c.get(c.HOUR_OF_DAY));
//        c.add(c.DATE, 35);
//        System.out.println("Add 35 days " + c.getTime());
//        c.roll(c.DATE, 35);
//        System.out.println("Roll 35 days " + c.getTime());
//        c.set(c.DATE, 1);
//        System.out.println("Set date in 1 " + c.getTime());


    }
}
