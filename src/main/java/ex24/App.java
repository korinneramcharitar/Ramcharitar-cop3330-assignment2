package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
import java.util.Arrays;
import java.util.Scanner;
public class App {


    static boolean isAnagram(String word1, String word2) {
        String w1 = word1.replaceAll("\\s", "");
        String w2 = word2.replaceAll("\\s", "");
        boolean status = true;
        if (w1.length() != w2.length()) {
            status = false;
        } else {
            char[] ArrayW1 = w1.toLowerCase().toCharArray();
            char[] ArrayW2 = w2.toLowerCase().toCharArray();
            Arrays.sort(ArrayW1);
            Arrays.sort(ArrayW2);
            status = Arrays.equals(ArrayW1, ArrayW2);
        }
        if (status) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String w1 = in.nextLine();
        System.out.println("Enter the second string: ");
        String w2 = in.nextLine();
        if(isAnagram(w1,w2))
        System.out.println(w1 + " and " + w2 + " are anagrams.");
            else
        System.out.println(w1 + " and " + w2 + " are not anagrams.");
    }
}

