import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int max = 0;
        int min = 101;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        int maxIndex = 0;
        int minIndex = 0;

        // First maximum
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                maxIndex = i;
                break;
            }
        }

        // Last minimum
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == min) {
                minIndex = i;
                break;
            }
        }

        int ans = maxIndex + (n - 1 - minIndex);

        if (maxIndex > minIndex) {
            ans--;
        }

        System.out.println(ans);
    }
}