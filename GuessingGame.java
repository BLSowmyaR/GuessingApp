package com.guessingapp;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char playAgain;

        do {
            Random random = new Random();
            int targetNumber = random.nextInt(100) + 1;

            int attempts = 0;
            boolean isGuessed = false;

            System.out.println("\n🎯 Guess a number between 1 and 100");

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("🎉 Correct! Attempts: " + attempts);
                    isGuessed = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!isGuessed) {
                System.out.println("❌ Game Over! Number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("Thanks for playing! 👋");
        scanner.close();
    }
}
