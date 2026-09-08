import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(), w = sc.nextInt();

        int n = 6 - Math.max(y, w) + 1;
        int g = gcd(n, 6);

        System.out.println(n / g + "/" + 6 / g);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}