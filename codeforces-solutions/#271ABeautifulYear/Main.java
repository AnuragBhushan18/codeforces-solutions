import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        while (true) {
            y++;

            String year = String.valueOf(y);

            boolean distinct = true;

            for (int i = 0; i < year.length(); i++) {
                for (int j = i + 1; j < year.length(); j++) {
                    if (year.charAt(i) == year.charAt(j)) {
                        distinct = false;
                        break;
                    }
                }

                if (!distinct) {
                    break;
                }
            }

            if (distinct) {
                System.out.println(y);
                break;
            }
        }
    }
}