import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();

        long total = k * w * (w + 1) / 2;

        if (total > n) {
            System.out.println(total - n);
        } else {
            System.out.println(0);
        }
    }
}