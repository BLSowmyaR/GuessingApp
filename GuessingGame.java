package com.guessingapp;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int attempts = 0;

        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < targetNumber) {
                System.out.println("Too low!");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high!");
            }
        }

        System.out.println("🎉 Correct! Attempts taken: " + attempts);
    }
}
