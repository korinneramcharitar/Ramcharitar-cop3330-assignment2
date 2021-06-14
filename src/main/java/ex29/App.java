package ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        int now;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rate of return:  ");
        now = sc.nextInt();

        if (now == 0) {

            System.out.println("Sorry. That's not a valid input");
        } else {
            int years = 72 / now;
            System.out.println("It will take " + years + " years to double your initial investment.");
        }

    }

}
