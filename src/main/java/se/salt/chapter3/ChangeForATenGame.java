package se.salt.chapter3;

//Creating a program that asks the user how many coins of each type
//Equal to 10 will be a win
//More or less will result in information about excess or how much is missing

import java.util.Scanner;

public class ChangeForATenGame {

    public static void main(String[] args) {

        double half = 0.5;
        double one = 1.0;
        double two = 2.0;
        double five = 5.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many halfs (0.5) do you have?");
        double infoHalfs = sc.nextDouble();
        System.out.println("How many ones (1) do you have?");
        double infoOnes = sc.nextDouble();
        System.out.println("How many twos (2) do you have?");
        double infoTwos = sc.nextDouble();
        System.out.println("How many fives (5) do you have?");
        double infoFives = sc.nextDouble();

        double totalSumCoins =
                (infoHalfs * half) + (infoOnes * one) + (infoTwos * two) + (infoFives * five);

        if (totalSumCoins == 10) {
            System.out.println("Congrats! You have a total coin value of: " + totalSumCoins);
        } else if (totalSumCoins < 10) {
            System.out.println("Sorry! Not enough coins. You are missing: " + (10 - totalSumCoins) + " to have a value of 10.0 coins");
        } else if (totalSumCoins > 10) {
            System.out.println("Sorry! To many coins. You are exceeding with: " + (totalSumCoins - 10) + " to have a value of 10.0 coins");
        }
    }
}
