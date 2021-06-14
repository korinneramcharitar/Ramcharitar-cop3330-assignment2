package ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */

import java.util.ArrayList;
import  java.util.Scanner;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter a name: ");
            String all = sc.nextLine();
            name.add(all);
            if (all.equals(""))
                break;
        }
        name.remove("");
        int randomIndex = (int) (Math.random()*name.size());

        System.out.println("The winner is " + name.get(randomIndex));



    }
}