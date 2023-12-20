import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("The given number is a Prime Number");
        }
        else {
            System.out.println("The given number is not a Prime Number");
        }
    }

    public static boolean isPrime(int value) {
        int flag = 0;
        for(int i=1;i<=value/2; i++)
        {
            if(value%i==0) {
                flag++;
            }
        }
        return flag<=1;
    }
}
