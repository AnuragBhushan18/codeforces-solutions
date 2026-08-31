import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int rating = sc.nextInt();

            if (rating >= 1900) {
                System.out.println("Division 1");
            } else if (rating >= 1600) {
                System.out.println("Division 2");
            } else if (rating >= 1400) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
    }
}
