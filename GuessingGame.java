package com.guessingapp;

import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        System.out.println("Welcome to the Number Guessing Game!");
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        System.out.println("A number has been generated between 1 and 100.");
    }
}
