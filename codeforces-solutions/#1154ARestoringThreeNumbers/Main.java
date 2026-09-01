import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[4];

        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        int total = x[3];

        int a = total - x[0];
        int b = total - x[1];
        int c = total - x[2];

        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}