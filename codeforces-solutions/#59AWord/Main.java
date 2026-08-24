import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int upper = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upper++;
            }
        }

        if (upper > s.length() / 2) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}