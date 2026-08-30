import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int police = 0;
        int untreated = 0;

        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();

            if (event == -1) {
                if (police > 0) {
                    police--;
                } else {
                    untreated++;
                }
            } else {
                police += event;
            }
        }

        System.out.println(untreated);
        sc.close();
    }
}
