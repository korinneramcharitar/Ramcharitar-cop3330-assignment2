package ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
import java.util.ArrayList;
import  java.util.Scanner;
import java.util.List;
public class App {

    public static void main() {

        ArrayList<String> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(String.valueOf(num));
        int s = 0;
        double  average;
        while (true) {
            System.out.println("Please enter a number: ");
            String all = sc.nextLine();
            num.add(all);

            if (all.equals("done"))
                break;
        }

        num.remove("done");
        System.out.println(num);

        for (int i=0; i < num.size(); i++){

            s += n;

        }
        average = s/num.size();


        System.out.println("The average is " + average);



    }
}
