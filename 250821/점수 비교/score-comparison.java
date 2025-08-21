import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[4];
        
        for (int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
        }
        
        int mathA = score[0];
        int engA = score[1];
        int mathB = score[2];
        int engB = score[3];

        if (mathA > mathB && engA > engB) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

    }
}