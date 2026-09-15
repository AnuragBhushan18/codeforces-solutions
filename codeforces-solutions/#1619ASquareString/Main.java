import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            if (n % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            String a = s.substring(0, n / 2);
            String b = s.substring(n / 2);

            System.out.println(a.equals(b) ? "YES" : "NO");
        }
    }
}