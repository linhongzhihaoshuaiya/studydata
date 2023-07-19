import java.util.Scanner;

public class demo023_heapmoni {
    static int N = 100010;
    static int[] h = new int[N];
    static int ph[] = new int[N];
    static int[] hp = new int[N];
    static int size, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        size=0;m=0;
        while (n-- > 0) {
            String s = sc.next();
            if (s.equals("I")) {
                int x = sc.nextInt();
                size++;
                m++;
                ph[m] = size;
                hp[size] = m;
                h[size] = x;
                up(size);
            } else if (s.equals("PM")) {
                System.out.println(h[1]);
            } else if (s.equals("DM")) {
                hswap(1,size);
                size--;
                down(1);
            } else if (s.equals("D")) {
                int k = sc.nextInt();
                hswap(ph[k],size);
                size--;

            } else {
                int k = sc.nextInt();
                int x = sc.nextInt();
                h[ph[k]] = x;
                up(ph[k]);
                down(ph[k]);
            }
        }

    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void hswap(int a, int b) {
        swap(ph, hp[a], hp[b]);
        swap(hp, a, b);
        swap(h, a, b);
    }

    public static void down(int u) {
        int t = u;
        if (u * 2 <= size && h[2 * u] < h[t]) t = 2 * u;
        if (2 * u + 1 < size && h[2 * u + 1] < h[t]) t = 2 * u + 1;
        if (t != u) {
            hswap(t,u);
            down(t);
        }
    }

    public static void up(int u) {
        int t = u;
        if (u/2>=1&&h[t] < h[u / 2]) t = u / 2;
        if (t != u) {
            hswap(t,u);
            up(t);
        }

    }
}
