import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder ans = new StringBuilder("I ");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                ans.append("hate");
            } else {
                ans.append("love");
            }

            if (i < n) {
                ans.append(" that I ");
            } else {
                ans.append(" it");
            }
        }

        System.out.println(ans);
    }
}