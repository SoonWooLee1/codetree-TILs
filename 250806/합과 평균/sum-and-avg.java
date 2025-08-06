import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();

        int hap = A+B;
        double avg = (double)(hap)/ 2;
        System.out.printf("%d %.1f", hap, avg);
    }
}