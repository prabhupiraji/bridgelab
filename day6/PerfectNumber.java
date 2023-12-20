import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int divisorsSum = 0;
        for(int i=1; i<=n/2; i++) {
            if(n%i == 0) {
                divisorsSum+=i;
            }
        }
        System.out.println("The sum of divisors of given number is... "+divisorsSum);
        if(n==divisorsSum) {
            System.out.println("The given number is Perfect Number");
        }
        else {
            System.out.println("The given number is not a Perfect Number");
        }

    }
}
