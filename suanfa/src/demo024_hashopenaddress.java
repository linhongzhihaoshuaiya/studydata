import java.util.Arrays;
import java.util.Scanner;

public class demo024_hashopenaddress {
    static int N = 200003;
    static int empty = ((int) 10e9)*2;
    static int h[] = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Arrays.fill(h,empty);
        while (m-- > 0) {
            String s = sc.next();
            int x = sc.nextInt();
            if (s.equals("I")) {
                int k = find(x);
                h[k] = x;

            } else {
                if (h[find(x)] == empty) System.out.println("No");
                else System.out.println("Yes");

            }
        }

    }

    public static int find(int x) {
        int k = Math.abs(x) % N;
        while (h[k] != empty && h[k] != x) {
            k++;
            if (k == N) k = 0;
        }
        return k;

    }
}
