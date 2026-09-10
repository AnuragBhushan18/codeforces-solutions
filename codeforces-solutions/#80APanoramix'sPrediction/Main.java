import java.util.*;

public class Main {
    static boolean prime(int x) {
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0) return false;
        return x > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        for (int x = n + 1; ; x++) {
            if (prime(x)) {
                System.out.println(x == m ? "YES" : "NO");
                break;
            }
        }
    }
}