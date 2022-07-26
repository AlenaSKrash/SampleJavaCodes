package com.qa.operators;

import java.util.Scanner;

public class ArithmeticOperators1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int valueOne = sc.nextInt();

        System.out.println("Enter the second number");
        int ValueTwo = sc.nextInt();

        int result = valueOne - ValueTwo;

        System.out.println("Subtraction of these 2 numbers ="+result);

    }
}
