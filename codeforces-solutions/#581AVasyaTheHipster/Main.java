import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int differentDays = Math.min(a, b);
        int sameDays = Math.abs(a - b) / 2;

        System.out.println(differentDays + " " + sameDays);

        sc.close();
    }
}