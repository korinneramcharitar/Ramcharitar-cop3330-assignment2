package ex25;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
//Functions help you abstract away complex operations, but they also help you build reusable components.
//Create a program that determines the complexity of a given password based on these rules:
//A very weak password contains only numbers and is fewer than eight characters.
//A weak password contains only letters and is fewer than eight characters.
//A strong password contains letters and at least one number and is at least eight characters.
//A very strong password contains letters, numbers, and special characters and is at least eight characters.

//The password '12345' is a very weak password.
//The password 'abcdef' is a weak password.
//The password 'abc123xyz' is a strong password.
//The password '1337h@xor!' is a very strong password.


//Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
//Use a single output statement.

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class App {

    public static void passwordValidator(String input) {


        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for(char i: input.toCharArray()){
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.println("Very Strong");
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.println("Strong");
        else if(hasLower || hasUpper && (n < 8))
            System.out.print("Weak");
        else
            System.out.print("Very Weak");
    }
    public static void main(String[] args)
    {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");
        input=sc.nextLine();
        passwordValidator(input);
    }
}
