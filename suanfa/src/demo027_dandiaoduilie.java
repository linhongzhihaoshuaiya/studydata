import java.io.*;
import java.util.Scanner;

public class demo027_dandiaoduilie {
    static int N = 1000010;
    static int[] a = new int[N];
    static int[] q = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wt = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s = bf.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String[] ss = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(ss[i]);
        }

        int hh = 0, tt = -1;
        for (int i = 0; i < n; i++) {
            if (hh <= tt && i - k + 1 > q[hh]) hh++;
            while (hh <= tt && a[i] <= a[q[tt]]) tt--;
            q[++tt] = i;
            if (i - k + 1 >= 0) wt.print(a[q[hh]] + " ");
        }
        wt.println();
        hh = 0;
        tt = -1;
        for (int i = 0; i < n; i++) {
            if (hh <= tt && i - k + 1 > q[hh]) hh++;
            while (hh <= tt && a[i] >= a[q[tt]]) tt--;
            q[++tt] = i;
            if (i - k + 1 >= 0) wt.print(a[q[hh]] + " ");
        }
        wt.flush();
    }
}
