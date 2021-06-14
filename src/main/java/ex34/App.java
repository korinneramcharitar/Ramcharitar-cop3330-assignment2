package ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */

import java.util.ArrayList;
import  java.util.Scanner;
public class App {
    public static void main(String[] args) {


        ArrayList<String> alist = new ArrayList<String>();
        alist.add("John Smith");
        alist.add("Jackie Johnson");
        alist.add("Chris Jones");
        alist.add("Amanda Cullen");
        alist.add("Jeremy Goodwin");
        System.out.println("There are 5 employees:");
        for (String str : alist)
            System.out.println(str);
        System.out.println("\nEnter an employee name to remove:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("\nThere are 4 employees: ");
        alist.remove(name);
        for (String str : alist) {

            System.out.println(str);

        }
    }



}
