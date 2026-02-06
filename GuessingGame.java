package com.guessingapp;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {

        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean isGuessed = false;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("🎉 You guessed it in " + attempts + " attempts!");
                isGuessed = true;
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (!isGuessed) {
            System.out.println("❌ Game Over! The number was: " + targetNumber);
        }
    }
}
