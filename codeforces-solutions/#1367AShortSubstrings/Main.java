import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String b = sc.next();
            StringBuilder a = new StringBuilder();

            a.append(b.charAt(0));
            for (int i = 1; i < b.length(); i += 2)
                a.append(b.charAt(i));

            System.out.println(a);
        }
    }
}