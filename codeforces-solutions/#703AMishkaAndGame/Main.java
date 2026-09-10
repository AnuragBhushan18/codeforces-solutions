import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = 0, c = 0;

        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a > b) m++;
            else if (b > a) c++;
        }

        if (m > c) System.out.println("Mishka");
        else if (c > m) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}