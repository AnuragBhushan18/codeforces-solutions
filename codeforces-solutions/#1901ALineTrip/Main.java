import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = a[0];

            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, a[i] - a[i - 1]);
            }

            ans = Math.max(ans, 2 * (x - a[n - 1]));

            System.out.println(ans);
        }

        sc.close();
    }
}