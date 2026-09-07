import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int dots = 0;
            boolean three = false;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    dots++;
                    if (i + 2 < n && s.substring(i, i + 3).equals("..."))
                        three = true;
                }
            }

            System.out.println(three ? 2 : dots);
        }
    }
}