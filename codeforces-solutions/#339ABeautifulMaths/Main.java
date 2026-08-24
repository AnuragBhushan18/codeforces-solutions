import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int one = 0, two = 0, three = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
            } else if (c == '2') {
                two++;
            } else if (c == '3') {
                three++;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < one; i++) {
            ans.append("1+");
        }

        for (int i = 0; i < two; i++) {
            ans.append("2+");
        }

        for (int i = 0; i < three; i++) {
            ans.append("3+");
        }

        // Last '+' remove karna
        ans.deleteCharAt(ans.length() - 1);

        System.out.println(ans);
    }
}
