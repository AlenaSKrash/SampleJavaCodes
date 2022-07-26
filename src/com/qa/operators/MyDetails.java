package com.qa.operators;

import java.util.Scanner;

public class MyDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println("What is your location?");
        sc.nextLine();
        String location = sc.nextLine();

        String result = name +"\n" + age + "\n"+ location;

        System.out.println("My details are \n"+result);
    }
}
