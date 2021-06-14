package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class App {

    public static void main(String[] args) {


        double APR;
        double balance;
        double payment ;
        double calc1 = -(1 /30);
        double thirty = 30;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");
        balance = input.nextFloat();
        System.out.println("What is the APR on the card (as a percent?)");
        APR = input.nextFloat();
        System.out.println("What is the monthly payment you can make?");
        payment = input.nextFloat();

        DecimalFormat formatter = new DecimalFormat("#0.00");
        double myAPR = APR/100;
        double Money  = (double) (calc1 * Math.log(1 + balance/payment * (1 + myAPR)));
        double Bank = (double) Math.pow(Money, thirty);
        double months =  (double) (Bank / Math.log(1+APR));

        System.out.println("It will take you " +   formatter.format(months) + " months  to pay off this card.");

    }
}
