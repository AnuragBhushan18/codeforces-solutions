
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        char[] s = sc.next().toCharArray();

        for (int time = 0; time < t; time++) {
            for (int i = 0; i < n - 1; i++) {

                if (s[i] == 'B' && s[i + 1] == 'G') {
                    // Swap B and G
                    s[i] = 'G';
                    s[i + 1] = 'B';

                    // Skip the next position
                    // because this child already moved
                    i++;
                }
            }
        }

        System.out.println(new String(s));

        sc.close();
    }
}