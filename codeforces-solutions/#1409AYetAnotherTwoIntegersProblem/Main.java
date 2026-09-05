import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long diff = Math.abs(a - b);

            System.out.println((diff + 9) / 10);
        }

        sc.close();
    }
}