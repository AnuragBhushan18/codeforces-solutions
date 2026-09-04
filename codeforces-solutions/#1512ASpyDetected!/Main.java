import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int common;

            if (a[0] == a[1]) {
                common = a[0];
            } else {
                common = a[2];
            }

            for (int i = 0; i < n; i++) {
                if (a[i] != common) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }

        sc.close();
    }
}