package com.csi.controller;

public class ArithmeticApplication {

    public static void main(String[] args) {

        ArithmeticApplication arithmeticApplication = new ArithmeticApplication();

        System.out.println("\n Addition Result: " + arithmeticApplication.add(5, 6));

        System.out.println("\n Substraction Result: " + arithmeticApplication.sub(4, 2));

        System.out.println("\n Multiplication Result: " + arithmeticApplication.mul(4, 2));

        System.out.println("\n Division Result: " + arithmeticApplication.div(10, 5));
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

   public int sub(int n1, int n2) {
        return n1 - n2;
    }

   public int mul(int n1, int n2) {
        return n1 * n2;
    }

   public int div(int n1, int n2) {
        return n1 / n2;
    }


}
