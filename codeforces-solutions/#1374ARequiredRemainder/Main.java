import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong(), y = sc.nextLong(), n = sc.nextLong();
            System.out.println(n - (n - y) % x);
        }
    }
}