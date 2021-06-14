package ex28;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        {
            int i, n = 0, s = 0;
            double avg;
            {

                System.out.println("Enter the number : ");

            }
            for (i = 0; i < 5; i++) {
                Scanner in = new Scanner(System.in);

                n = in.nextInt();

                s += n;
            }
            avg = s / 5;
            System.out.println("The total is : " + s + "." );

        }
    }
}
