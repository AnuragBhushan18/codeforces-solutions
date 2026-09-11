import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            String x = sc.next(), s = sc.next();

            int ans = -1, op = 0;

            while (x.length() <= 2 * m + n) {
                if (x.contains(s)) {
                    ans = op;
                    break;
                }
                x += x;
                op++;
            }

            System.out.println(ans);
        }
    }
}