import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        String result;

        if (Y % 4 == 0){
            if (Y % 100 == 0 && Y % 400 != 0) {
                result = "false";
            } else {
                result = "true";
            }
        } else {
            result = "false";
        }
        System.out.print(result);
    }
}