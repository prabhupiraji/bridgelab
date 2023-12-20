import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibonacci series length value: ");
        int n = sc.nextInt();
        int x1 = 0;
        int x2 = 1;
        int x3;
        System.out.println(x1);
        System.out.println(x2);
        for(int i=3; i<=n; i++) {
            x3 = x1+x2;
            x1 = x2;
            x2 = x3;
            System.out.println(x3);
        }
    }
}
