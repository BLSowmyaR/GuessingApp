package com.guessingapp;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
    }
}
