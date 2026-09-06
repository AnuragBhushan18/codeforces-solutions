
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            System.out.println(s.equals("abc") || s.equals("acb") ||
                    s.equals("bac") || s.equals("cba") ? "YES" : "NO");
        }
    }
}