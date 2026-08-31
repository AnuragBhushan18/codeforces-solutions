import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int sereja = 0;
        int dima = 0;
        boolean serejaTurn = true;

        while (left <= right) {
            int card;

            if (a[left] > a[right]) {
                card = a[left++];
            } else {
                card = a[right--];
            }

            if (serejaTurn) {
                sereja += card;
            } else {
                dima += card;
            }

            serejaTurn = !serejaTurn;
        }

        System.out.println(sereja + " " + dima);
    }
}