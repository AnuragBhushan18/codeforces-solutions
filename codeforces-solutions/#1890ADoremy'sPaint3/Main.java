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

            Arrays.sort(a);

            if (n % 2 == 1) {
                boolean ok = true;
                for (int i = 1; i < n; i++)
                    if (a[i] != a[i - 1] && a[i] != a[0])
                        ok = false;

                System.out.println(ok ? "Yes" : "No");
            } else {
                System.out.println(a[0] == a[n / 2] && a[n / 2 - 1] == a[n - 1]
                        ? "Yes" : "No");
            }
        }
    }
}