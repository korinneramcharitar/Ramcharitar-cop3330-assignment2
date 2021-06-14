package ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */

import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = in.nextInt();
        System.out.println("Enter resting heart rate: ");
        int rhr = in.nextInt();

        System.out.println("Resting Pulse: " + rhr + " Age: " + age);

        int intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while (intensity < 96) {
            double intense = (intensity*  .01);
            double Target = (((220 - age) - rhr) * intense ) + rhr;
            System.out.println("      " + intensity + "% | " + Math.round(Target)+ "bpm");
            intensity += 5;
        }


    }
}
