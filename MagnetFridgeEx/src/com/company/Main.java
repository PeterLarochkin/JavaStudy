package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("Input a number: ");
        String test = in.next();
        try {
            System.out.print("t");
            doRisky(test);
            System.out.print('o');

        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            {
                System.out.print("w");
            }
            System.out.print("s");
        }
    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r");
    }
}
