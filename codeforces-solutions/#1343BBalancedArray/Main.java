import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if ((n / 2) % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            int k = n / 2;
            for (int i = 1; i <= k; i++)
                System.out.print(2 * i + " ");

            for (int i = 1; i < k; i++)
                System.out.print(2 * i - 1 + " ");

            System.out.println(2 * k + 1);
        }
    }
}