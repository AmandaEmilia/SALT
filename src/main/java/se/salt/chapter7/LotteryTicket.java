package se.salt.chapter7;

import java.util.Random;

public class LotteryTicket {

    public static void main(String[] args) {

        int[]lotteryTicket = generateLotteryNumbers();

        printTicket(lotteryTicket);

    }

    public static int[] generateLotteryNumbers(){
        Random random = new Random();
        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            numbers[i] = random.nextInt(1,69);
        }
        return numbers;
    }

    private static void printTicket(int[] lotteryTicket) {
        for (int i = 0; i < generateLotteryNumbers().length; i++) {
            System.out.print(lotteryTicket[i] + " - ");
        }
    }
}
