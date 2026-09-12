import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int digit = x % 10;
            int len = String.valueOf(x).length();

            int ans = (digit - 1) * 10;
            ans += len * (len + 1) / 2;

            System.out.println(ans);
        }
    }
}