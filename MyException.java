package com.company;

import java.util.Scanner;

public class MyException extends Exception {

    public MyException(String s) {

        super(s);
    }
}
class ExampleException {
    public static void main (String[] args) {

        try  {
           throw new MyException("this is a string");
        } catch (MyException e) {
            System.out.println("this is an exception");
            System.out.println(e.getMessage());

        }
    }
}

class MinimumAmount extends Exception {

    String s;

    public MinimumAmount (String s) {

        this.s = s;

    }

}
class UserDefinerException {

    static double currentAmount = 500;

    public static void main (String[] args) throws MinimumAmount {

        Scanner n = new Scanner(System.in);

        System.out.println("enter the value");

        int number = n.nextInt();

        try {
            if (currentAmount < number) {
                throw new MinimumAmount("the amount is low");

            } else {
                System.out.println("the amount is " + number);
            }
        } catch (MinimumAmount amount) {
            amount.printStackTrace();
    }

    }

}