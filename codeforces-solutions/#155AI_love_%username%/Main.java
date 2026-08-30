import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int first = sc.nextInt();

        int min = first;
        int max = first;
        int amazing = 0;

        for (int i = 1; i < n; i++) {
            int score = sc.nextInt();

            if (score > max) {
                amazing++;
                max = score;
            } else if (score < min) {
                amazing++;
                min = score;
            }
        }

        System.out.println(amazing);

        sc.close();
    }
}

