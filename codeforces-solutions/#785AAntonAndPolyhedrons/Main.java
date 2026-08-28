import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("Tetrahedron"))
                total += 4;
            else if (s.equals("Cube"))
                total += 6;
            else if (s.equals("Octahedron"))
                total += 8;
            else if (s.equals("Dodecahedron"))
                total += 12;
            else if (s.equals("Icosahedron"))
                total += 20;
        }

        System.out.println(total);
    }
}