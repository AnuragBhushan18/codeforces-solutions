import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] a = s.toCharArray();
            char[] b = "Timur".toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            System.out.println(n == 5 && Arrays.equals(a, b) ? "YES" : "NO");
        }
    }
}