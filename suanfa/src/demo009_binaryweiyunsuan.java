import java.util.Scanner;

public class demo009_binaryweiyunsuan {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 10];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            int e=a[i];
            int s = 0;
            while (e != 0) {
                e -= lowbit(e);
                s++;
            }
            System.out.println(s);
        }*/
        int res = kweishu(10, 1);//看一个数的二进制第k位是多少(k从0开始)
        System.out.println(res);
    }

    public static int lowbit(int n) {//看一个数的最低1再哪里
        return n & -n;
    }

    public static int kweishu(int n, int k) {
        return n >> k & 1;

    }
}
