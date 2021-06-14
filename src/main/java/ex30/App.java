package ex30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */

public class App {
    public static void main(String[] args) {
        int a;
        int b;
        for (a = 1; a <= 12; ++a) {
            for (b = 1; b <= 12; ++b) {
                System.out.print(String.format("%4d", a * b));
            }
            System.out.println();
        }
    }
}
