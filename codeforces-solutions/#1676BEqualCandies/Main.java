import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE, sum = 0;

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                min = Math.min(min, a[i]);
            }

            for (int x : a)
                sum += x - min;

            System.out.println(sum);
        }
    }
}
