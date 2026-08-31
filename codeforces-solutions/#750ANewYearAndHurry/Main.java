import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int availableTime = 240 - k;
        int time = 0;
        int solved = 0;

        for (int i = 1; i <= n; i++) {
            time += 5 * i;

            if (time <= availableTime) {
                solved++;
            } else {
                break;
            }
        }

        System.out.println(solved);
    }
}