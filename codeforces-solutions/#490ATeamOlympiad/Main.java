import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer>[] a = new ArrayList[4];

        for (int i = 1; i <= 3; i++)
            a[i] = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            a[sc.nextInt()].add(i);

        int teams = Math.min(a[1].size(),
                    Math.min(a[2].size(), a[3].size()));

        System.out.println(teams);

        for (int i = 0; i < teams; i++)
            System.out.println(a[1].get(i) + " " +
                               a[2].get(i) + " " +
                               a[3].get(i));
    }
}