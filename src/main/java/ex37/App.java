package ex37;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int length;
        int chars;
        int num;
        String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String low = "abcdefghijklmnopqrstuvwxyz";
        String special = "!@#$%^&*()";
        String numbers = "1234567890";
        String combination = cap + low +  special  + numbers;

        Scanner in = new Scanner(System.in);

        System.out.println("Whats the minimum length?");
        length = in.nextInt();

        System.out.println("How many special characters?");
        chars = in.nextInt();


        System.out.println("How many numbers?");
        num= in.nextInt();
        
        String result = "";
        String fin = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(combination.length());
            result +=  combination.charAt(index);
        }
        System.out.println("Your password is: " + result);
    }
    }





