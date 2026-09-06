import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            System.out.println(Math.max(a, Math.max(b, c)) +
                    Math.min(a, Math.min(b, c)) >= 10 ? "YES" : "NO");
        }
    }
}