import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                ans.append('0');
            } else {
                i++;

                if (s.charAt(i) == '.') {
                    ans.append('1');
                } else {
                    ans.append('2');
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}