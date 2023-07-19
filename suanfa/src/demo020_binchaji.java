
import java.util.Scanner;

public class demo020_binchaji {
    static int[] p = new int[100010];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            p[i] = i;
        }
        while (m-- > 0) {
            String s = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (s.equals("M")) {

                p[find(a)] = find(b);
            } else {

                if (find(a) == find(b)) {
                    System.out.println("YES");
                } else System.out.println("No");
            }
        }


    }

    public static int find(int x) {
        if (p[x] != x) p[x] = find(p[x]);
        return p[x];
    }
}
