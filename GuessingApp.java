package com.guessingapp;

import java.util.Random;
import java.util.Scanner;

public class GuessingApp {

    public static void main(String[] args) {

        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("🎉 Congratulations! You guessed the number.");
    }
}
