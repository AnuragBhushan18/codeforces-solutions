import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        String rev = new StringBuilder(s).reverse().toString();

        if (rev.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}