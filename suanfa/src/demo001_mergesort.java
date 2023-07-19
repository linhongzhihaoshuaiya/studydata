import java.util.Scanner;

public class demo001_mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mergesort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    public static void mergesort(int[] a, int l, int r) {
        if (l >= r) return;
        int middle = (l + r) / 2;
        mergesort(a, l, middle);
        mergesort(a, middle + 1, r);
        int[] tmp = new int[r - l + 1];
        int i = l, j = middle + 1, k = 0;
        while (i <= middle && j <= r) {
            if (a[i] <= a[j]) tmp[k++] = a[i++];
            else tmp[k++] = a[j++];
        }
        while (i <= middle) tmp[k++] = a[i++];
        while (j <= r) tmp[k++] = a[j++];
        for (i = l, j = 0; i <= r; i++, j++) a[i] = tmp[j];
    }
}
