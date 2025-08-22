import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        StringBuilder sb = new StringBuilder(n);
        sb.setCharAt(1, 'a');                         
        sb.setCharAt(n.length() - 2, 'a');             

        System.out.print(sb.toString());
    }
}
