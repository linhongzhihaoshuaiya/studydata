import java.util.Scanner;

public class demo002_erfenzhenshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int l = 0, r = n - 1;
            while (l < r) {
                int middle = (l + r) / 2;
                if (a[middle] >= x) r = middle;
                else l = middle + 1;
            }

            if (a[l] != x) {
                System.out.println("-1 -1");
            } else {
                System.out.print(r + " ");
                int l1 = 0, r1 = n - 1;

                while (l1 < r1) {
                    int middle1 = (l1 + r1 + 1) / 2;
                    if (a[middle1] <= x) l1 = middle1;
                    else r1 = middle1 - 1;
                }
                System.out.print(r1);
                System.out.println();
            }
        }

    }
}
