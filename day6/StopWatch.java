import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press S to start");
        char start = sc.next().charAt(0);
        if(start=='s' || start=='S') {
            startTime = System.currentTimeMillis();
            char end = 0;
            while(end!='e' && end!='E') {
                System.out.println("Enter e key to end");
                end = sc.next().charAt(0);
            }
            endTime = System.currentTimeMillis();
            long elapsedTime = endTime-startTime;
            long seconds = elapsedTime/1000;
            long milliSeconds = elapsedTime%1000;
            System.out.println("Elapsed time between Start and End is: "+seconds+" Seconds "+milliSeconds+" milliseconds");
        }
        else {
            System.out.println("Input wrong try again");
        }
    }
}
