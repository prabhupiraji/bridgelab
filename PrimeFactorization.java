package assignment;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int N = scanner.nextInt();

        scanner.close();

        System.out.print("Prime factors of " + N + " are: ");
        computePrimeFactors(N);
    }

    public static void computePrimeFactors(int num) {
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 2) {
            System.out.print(num);
        }
    }
}

