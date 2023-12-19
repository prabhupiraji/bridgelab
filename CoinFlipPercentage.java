package assignment;

import java.util.Random;

public class CoinFlipPercentage {
    public static void main(String[] args) {
        int flips = 1000; // Replace this with your desired number of flips
        if (flips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

        Random random = new Random();
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < flips; i++) {
            if (random.nextDouble() < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double percentageHeads = (double) heads / flips * 100;
        double percentageTails = (double) tails / flips * 100;

        System.out.println("Number of flips: " + flips);
        System.out.println("Percentage of Heads: " + percentageHeads + "%");
        System.out.println("Percentage of Tails: " + percentageTails + "%");
    }
}

