import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int a = 0;

            for (char c : s.toCharArray())
                if (c == 'A') a++;

            System.out.println(a > 2 ? "A" : "B");
        }
    }
}