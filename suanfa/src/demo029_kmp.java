import java.io.*;

public class demo029_kmp {
    static int N = 100010, M = 1000010;
    static char[] s = new char[M];
    static char[] p = new char[N];
    static int[] ne = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String P = bf.readLine();
        for (int i = 1; i <= n; i++) {
            p[i] = P.charAt(i - 1);

        }
        int m = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        for (int i = 1; i <= m; i++) {
            s[i] = S.charAt(i - 1);

        }
        for (int i = 2, j = 0; i <= n; i++) {
            while (j != 0 && p[i] != p[j + 1]) j = ne[j];
            if (p[i] == p[j + 1]) j++;
            ne[i] = j;
        }
        for (int i = 1, j = 0; i <= m; i++) {
            while (j != 0 && s[i] != p[j + 1]) j = ne[j];
            if (s[i] == p[j + 1]) j++;
            if (j == n) {
                bw.write((i - n) + " ");
                j = ne[j];
            }

        }
        bw.flush();


    }
}