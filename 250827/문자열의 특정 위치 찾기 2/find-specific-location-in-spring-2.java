import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = "apple";
        String b = "banana";
        String c = "grape";
        String d = "blueberry";
        String e = "orange";
        int cnt = 0;

        char n = sc.next().charAt(0);

        if ((a.charAt(2) == n) || (a.charAt(3) == n)) {
            System.out.println(a);
            cnt++;
        }

        if ((b.charAt(2) == n) || (b.charAt(3) == n)) {
            System.out.println(b);
            cnt++;
        }

        if (((c.charAt(2) == n) || (c.charAt(3) == n))) {
            System.out.println(c);
            cnt++;
        }

        if (((d.charAt(2) == n) || (d.charAt(3) == n))) {
            System.out.println(d);
            cnt++;
        }

        if (((e.charAt(2) == n) || (e.charAt(3) == n))) {
            System.out.println(e);
            cnt++;
        }
        System.out.print(cnt);
    }
}