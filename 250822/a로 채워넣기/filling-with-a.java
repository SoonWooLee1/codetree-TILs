import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if (n.length() < 2) {          // 길이 검증
            System.out.print(n);
            return;
        }

        StringBuilder sb = new StringBuilder(n);
        sb.setCharAt(1, 'a');                          // 두 번째 문자
        sb.setCharAt(n.length() - 2, 'a');             // 뒤에서 두 번째 문자

        System.out.print(sb.toString());
    }
}
