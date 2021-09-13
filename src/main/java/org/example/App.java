package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 18 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String temp; //declare the variable

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n Your choice: ");

        temp = userInput.nextLine();

        //establish the celsius
        if (temp.toLowerCase().equals("c")) {

            double tempF;
            System.out.print("Please enter the temperature in Fahrenheit: ");
            tempF = userInput.nextDouble();

            double c = (tempF - 32) * 5 / 9; //celsius formula

            System.out.print("The temperature in Celsius is "+ c + ".");
        }

        //if is fahrenheit
        else if (temp.toLowerCase().equals("f")){

            double tempC;
            System.out.print("Please enter the temperature in Celsius: ");
            tempC = userInput.nextDouble();

            double f = (tempC * 9 / 5) + 32; //fahrenheit formula

            System.out.print("The temperature in Fahrenheit is "+ f + ".");
        }
    }
}