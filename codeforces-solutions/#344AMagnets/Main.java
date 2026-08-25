import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String previous = sc.next();
        int groups = 1;

        for (int i = 1; i < n; i++) {
            String current = sc.next();

            if (!current.equals(previous)) {
                groups++;
            }

            previous = current;
        }

        System.out.println(groups);
    }
}