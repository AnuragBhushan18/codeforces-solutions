import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (k > 1) {
                System.out.println("YES");
            } else {
                boolean sorted = true;

                for (int i = 1; i < n; i++) {
                    if (a[i] < a[i - 1]) {
                        sorted = false;
                        break;
                    }
                }

                System.out.println(sorted ? "YES" : "NO");
            }
        }

        sc.close();
    }
}