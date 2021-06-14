package ex33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class App {
    private static Scanner scanner = new Scanner(System.in);

    private static String[] get8BallAnswers() {
        return new String[]{"Yes", "No", "Maybe", "Ask again later"};
    }

    private static String get8BallAnswers(int num) {
        return get8BallAnswers()[num];
    }

    public static void main(String[] args) {
        while (true) {
            magic8Ball();

            System.out.println("Do you want to try again, yes or no?");

            if (scanner.nextLine().toLowerCase().contains("n")) {
                System.out.println("Goodbye");
                break;
            }
        }
    }

    private static void magic8Ball() {
        System.out.println("Ask me a question.");
        scanner.nextLine();

        System.out.println(get8BallAnswers(new Random().nextInt(get8BallAnswers().length)));
    }
}}
