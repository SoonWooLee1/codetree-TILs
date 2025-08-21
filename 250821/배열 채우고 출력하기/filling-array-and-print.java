import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = s.replace(" ", "");

        StringBuilder sb = new StringBuilder(ss);
        sb.reverse();

        System.out.println(sb.toString());     
    } 
}