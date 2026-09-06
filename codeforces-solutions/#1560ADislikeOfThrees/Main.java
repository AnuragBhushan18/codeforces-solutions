import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt(), n = 0, count = 0;

            while (count < k) {
                n++;
                if (n % 3 != 0 && n % 10 != 3)
                    count++;
            }

            System.out.println(n);
        }
    }
}