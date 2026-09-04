import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int current = 0;
            int max = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 0) {
                    current++;
                    max = Math.max(max, current);
                } else {
                    current = 0;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}