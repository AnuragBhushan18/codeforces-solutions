import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next(), b = sc.next();
            System.out.println(b.charAt(0) + a.substring(1) + " " +
                               a.charAt(0) + b.substring(1));
        }
    }
}

