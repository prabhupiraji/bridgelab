package assignment;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 0 || N >= 31) {
            System.out.println("N should be between 0 and 30 (inclusive).");
            return;
        }

        System.out.println("Powers of 2 less than or equal to 2^" + N + ":");
        int power = 1;

        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
    }
}
