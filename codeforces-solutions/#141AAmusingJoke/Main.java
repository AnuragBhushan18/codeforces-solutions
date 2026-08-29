import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        int[] count = new int[26];

        for (char c : guest.toCharArray()) {
            count[c - 'A']++;
        }

        for (char c : host.toCharArray()) {
            count[c - 'A']++;
        }

        for (char c : pile.toCharArray()) {
            count[c - 'A']--;
        }

        for (int x : count) {
            if (x != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

        sc.close();
    }
}
