import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == k) {
                    found = true;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}