import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            char[][] a = new char[10][10];

            for (int i = 0; i < 10; i++) {
                a[i] = sc.next().toCharArray();
            }

            int ans = 0;

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (a[i][j] == 'X') {
                        int ring = Math.min(
                            Math.min(i, 9 - i),
                            Math.min(j, 9 - j)
                        ) + 1;

                        ans += ring;
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}