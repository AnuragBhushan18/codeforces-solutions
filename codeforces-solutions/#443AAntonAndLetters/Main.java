import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        boolean[] present = new boolean[26];

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
            }
        }

        int count = 0;

        for (boolean x : present) {
            if (x) {
                count++;
            }
        }

        System.out.println(count);
    }
}