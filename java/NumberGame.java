package java;

import java.util.*;

public class NumberGame {
    public static void main(String[] args) {

        Scanner hera = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("Guess a number from 1 to 100!");

        while (true) {

            System.out.print("\nEnter your guess: ");
            guess = hera.nextInt();

            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            }
            else if (guess < number) {
                System.out.println("Too low!");
            }
            else {
                System.out.println("\nCongratulations! You won!");
                System.out.println("Number: " + number);
                System.out.println("Attempts: " + attempts);
                break;
            }
        }

        hera.close();
    }
}
