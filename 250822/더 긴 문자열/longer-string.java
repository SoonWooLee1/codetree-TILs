import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        String b = "";

        a = sc.next();
        b = sc.next();
        int c = a.length();
        int d = b.length();
        if (c > d) {
            System.out.print(a + " " + c);
        } else if(c < d) {
            System.out.print(b + " " + d);
        } else {
            System.out.print("same");
        }
        
    }
}