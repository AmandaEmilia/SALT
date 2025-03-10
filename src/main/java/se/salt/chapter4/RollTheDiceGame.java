package se.salt.chapter4;

import java.util.Random;

public class RollTheDiceGame {

    public static void main(String[] args) {
        Random random = new Random();

        int totalBoardSpaces = 20;
        int numberOfRolls = 5;
        int sumOfAllRolls = 0;

        for (int i = 0; i < numberOfRolls; i++) {

            int dice = random.nextInt(1, 6);
            sumOfAllRolls += dice;
            System.out.println("#" + (i + 1) + " You rolled: " + dice + " --- BoardSpace: " + sumOfAllRolls + " --- Roll(s) left: " + (4 - i));

            if (sumOfAllRolls > totalBoardSpaces) {
                System.out.println("You scored over the allowed");
                break;
            } else if (totalBoardSpaces == sumOfAllRolls) {
                System.out.println("GREAT! You made it to exactly " + sumOfAllRolls + " which is a win!");
                break;
            } else if (i == 4) {
                System.out.println("You only made it to space: " + sumOfAllRolls + " and missed goal by " + (totalBoardSpaces - sumOfAllRolls) + " steps");
            }
        }

    }
}
