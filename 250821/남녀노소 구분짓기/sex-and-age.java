import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();
        String result = "";
        if (age >= 19){
            if (gender == 0){
                result = "MAN";
            } else {
                result = "WOMAN";
            }
        } else {
            if (gender == 0) {
                result = "BOY";
            } else {
                result = "GIRL";
            }
        }
        System.out.println(result);
    }
}