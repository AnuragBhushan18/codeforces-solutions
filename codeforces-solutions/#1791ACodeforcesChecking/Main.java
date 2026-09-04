import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String s = "codeforces";

        while (t-- > 0) {
            char c = sc.next().charAt(0);

            if (s.indexOf(c) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}