package ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class App {
    public static void insertFunction1(String input) {
        int n = input.length();
        boolean hasLower = false, hasUpper = false;
        for (char i : input.toCharArray()) {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
        }

        if ((hasLower || hasUpper) == n < 2)
            System.out.println("The first name must be 2 characters long.");
    }

    public static void insertFunction2(String input) {
        int m = input.length();
        boolean hasLower = false, hasUpper = false;
        for (char i : input.toCharArray()) {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
        }
        if ((hasLower || hasUpper) == m < 2)
            System.out.println("The last name must be 2 characters long.");
    }

    public static void insertFunction3(String input) {
        int m = input.length();
        boolean hasDigit = false;
        Set<Character> set = new HashSet<Character>(Arrays.asList('-'));
        for(char i: input.toCharArray()) {
            if (Character.isDigit(i))
                hasDigit = true;
        }
        if (( hasDigit == (m != 5)))
            System.out.println("The zipcode must be a 5 digit number.");
    }

    public static void insertFunction4(String input) {
        {
            Scanner sc = new Scanner(System.in);
            int m = input.length();
            boolean hasletters = false,
                    hasDigit = false, specialChar = false;
            Set<Character> set = new HashSet<Character>(Arrays.asList('-'));
            for(char i: input.toCharArray()) {
                if (Character.isUpperCase(i))
                    hasletters = true;
                if (Character.isDigit(i))
                    hasDigit = true;
                if (set.contains(i))
                    specialChar = true;

            }
            if (( hasDigit == (m != 4) & (hasletters == (m != 2))))
                System.out.println("The employee ID must be in the format of AA-1234.");
        }
    }

    public static void main(String[] args) {
        String input;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First name:  ");
        input = sc.nextLine();
        insertFunction1(input);
        System.out.println("Enter Last name:  ");
        input = sc.nextLine();
        insertFunction2(input);
        System.out.println("Please enter id: ");
        input = sc.nextLine();
        if(input.matches("\\S{2}-\\d{4}")) {
            System.out.println("valid ID");
        }
        else System.out.println("Invalid");
        System.out.println("Please enter zipcode: ");
        input = sc.nextLine();
        insertFunction3(input);
    }

}
