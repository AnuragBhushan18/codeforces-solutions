import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            long ans = 0;

            for (int i = 0; i < n; i++) {
                long product = 1;

                for (int j = 0; j < n; j++)
                    product *= (j == i ? a[j] + 1 : a[j]);

                ans = Math.max(ans, product);
            }

            System.out.println(ans);
        }
    }
}