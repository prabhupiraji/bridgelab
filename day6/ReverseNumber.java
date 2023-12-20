import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        reverseNumber(num);
    }
    public static void reverseNumber(int num) {
        int revnum = 0;
        while(num>0) {
            int unit = num%10;
            num = num/10;
            revnum = revnum*10+unit;
        }
        System.out.println(revnum);
    }
}

