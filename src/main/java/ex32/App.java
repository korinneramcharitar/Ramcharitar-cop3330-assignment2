package ex32;

import java.util.Random;
import java.util.Scanner;

public class App {


    public static int GuessGame1(Scanner args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);

        return rand_int1;
    }

    public static int GuessGame2(Scanner args) {
        Random rand = new Random();
        int rand_int2 = 1 + rand.nextInt(100);
        return rand_int2;
    }

    public static int GuessGame3(Scanner args) {
        Random rand = new Random();
        int rand_int3 = rand.nextInt(1000);
        return rand_int3;
    }

    public static void Choice1(Scanner args) {
        int guess1;
        int attempts = 1;
        Scanner input = new Scanner(System.in);
        GuessGame1(input);
        int GuessGame1 = GuessGame1(input);
        System.out.println("I have my number. What's your guess? ");
        guess1 = input.nextInt();
        while (true) {
            if (guess1 > GuessGame1) {
                System.out.println("Too high. Guess again: ");
                guess1 = input.nextInt();
                attempts += 1;
            }
            if (guess1 < GuessGame1) {
                System.out.println("Too low. Guess again: ");
                guess1 = input.nextInt();
                attempts += 1;
            }
            if (guess1 == GuessGame1) {
                System.out.println("You got it and it took you " + attempts + " attempts to solve it.");
                break;
            }
        }
    }

    public static void Choice2(Scanner args) {
        int guess2;
        int attempts = 1;
        Scanner input = new Scanner(System.in);

        GuessGame2(input);
        int GuessGame2 = GuessGame2(input);
        System.out.println("I have my number. What's your guess? ");
        guess2 = input.nextInt();
        while (true) {
            if (guess2 > GuessGame2) {
                System.out.println("Too high. Guess again: ");
                guess2 = input.nextInt();
                attempts += 1;
            }
            if (guess2 < GuessGame2) {
                System.out.println("Too low. Guess again: ");
                guess2 = input.nextInt();
                attempts += 1;
            }
            if (guess2 == GuessGame2) {
                System.out.println("You got it and it took you " + attempts + " attempts to solve it.");
                break;

            }
        }
    }

    public static void Choice3(Scanner args) {
        int guess3;
        int attempts = 1;
        Scanner input = new Scanner(System.in);
        GuessGame3(input);
        int GuessGame3 = GuessGame3(input);
        System.out.println("I have my number. What's your guess? ");
        guess3 = input.nextInt();
        while (true) {
            if (guess3 > GuessGame3) {
                System.out.println("Too high. Guess again: ");
                guess3 = input.nextInt();
                attempts += 1;
            }
            if (guess3 < GuessGame3) {
                System.out.println("Too low. Guess again: ");
                guess3 = input.nextInt();

                attempts += 1;
            }
            if (guess3 == GuessGame3) {
                System.out.println("You got it and it took you " + attempts + " to get it!");
                break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String YN;


        while (true) {

            System.out.println("Let's play Guess the Number!\n Enter the difficulty level (1, 2, or 3): ");
            choice = input.nextInt();

            if (choice == 1) {
                Choice1(input);
                System.out.println("Would you like to play again?(Y/N)");
                YN = input.nextLine();
                if (input.nextLine() == "yes") {
                    break;
                } else if (input.nextLine() == "no") {
                    System.exit(0);
                }
            }
            if (choice == 2) {
                Choice2(input);
                System.out.println("Would you like to play again?(Y/N)");
                YN = input.nextLine();
                if (input.nextLine() == "yes") {
                    break;
                }
                else if (input.nextLine() == "no") {
                    System.exit(0);
                }
            }

            if (choice == 3) {
                Choice3(input);
                System.out.println("Would you like to play again?(Y/N)");
                YN = input.nextLine();

                if (input.nextLine() == "yes" ) {
                    break;
                }
                else if (input.nextLine() == "no" ) {
                    System.exit(0);
                }
            }
        }
    }
}
