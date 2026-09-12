import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = 0, cubes = 0, level = 1;

        while (cubes + level * (level + 1) / 2 <= n) {
            cubes += level * (level + 1) / 2;
            h++;
            level++;
        }

        System.out.println(h);
    }
}