import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int current = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            current -= a;
            current += b;

            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}