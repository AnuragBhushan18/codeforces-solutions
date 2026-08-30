import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int drinkToasts = (k * l) / nl;
        int limeToasts = c * d;
        int saltToasts = p / np;

        int totalToasts = Math.min(drinkToasts,
                Math.min(limeToasts, saltToasts));

        System.out.println(totalToasts / n);

        sc.close();
    }
}