package com.qa.operators;


import java.util.Scanner;

public class ArithmeticOperators {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int valueOne = sc.nextInt();

        System.out.println("enter the second number");
        int valueTwo = sc.nextInt();

        int result = valueOne + valueTwo;

        System.out.println("Addition of 2 numbers =" + result);

    }
}
