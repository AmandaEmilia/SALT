package se.salt.chapter2;

// Create a program that asks a user for a season of the year,
// then a whole number, then an adjective.
// And use the input to complete the sentence below.
// Output the result.

import java.util.Scanner;

public class JavaFundamentals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write/enter a season of the year:");
        String season = sc.next();

        System.out.println("Write/enter a whole number:");
        int number = sc.nextInt();

        System.out.println("Write/enter an adjective:");
        String adjective = sc.next();

        sc.close();

        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee", adjective, season, number);

    }
}
