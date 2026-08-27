import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int[] bills = {100, 20, 10, 5, 1};

        int count = 0;

        for (int bill : bills) {
            count += n / bill;
            n %= bill;
        }

        System.out.println(count);
    }
}