import java.util.Scanner;

public class demo006_yiweichafen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 10];
        int[] b = new int[n + 10];
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            Insert(b, i, i, a[i]);
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            Insert(b, l, r, c);
        }
        for (int i = 1; i <= n; i++) {
            b[i] = b[i] + b[i - 1];
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(b[i]);
        }

    }

    public static void Insert(int[] b, int l, int r, int c) {
        b[l] += c;
        b[r + 1] -= c;

    }
}
