import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> colors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            colors.add(sc.nextInt());
        }

        System.out.println(4 - colors.size());
    }
}