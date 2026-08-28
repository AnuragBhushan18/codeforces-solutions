import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Full row
                System.out.println("#".repeat(m));
            } 
            else if (i % 4 == 1) {
                // Right side
                System.out.println(".".repeat(m - 1) + "#");
            } 
            else {
                // Left side
                System.out.println("#" + ".".repeat(m - 1));
            }
        }
    }
}