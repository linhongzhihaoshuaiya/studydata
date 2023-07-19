import java.util.Arrays;
/*import java.util.Scanner;

public class demo000_quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quicksort(a, 0, n - 1);
        print(n, a);
    }

    public static void quicksort(int[] a, int l, int r) {
        if (l < r) {
            int m = partition(a, l, r);
            quicksort(a, l, m - 1);
            quicksort(a, m + 1, r);
        }
    }

    public static int partition(int[] a, int l, int r) {
        int x = a[l], high = r + 1, low = l;



        while (true) {
            while (a[--high] > x && low < high) ;//17460
            while (a[++low] < x && low < high) ;
            if (low >= high) break;
            int t = a[low];
            a[low] = a[high];
            a[high] = t;
        }
        a[l] = a[high];
        a[high] = x;


        return high;
    }


    private static void print(int n, int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}*/

import java.util.Scanner;
public class demo000_quicksort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        quicksort(a,0,a.length - 1);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void quicksort(int[] a, int l, int r){
        if(l >= r) return ;
        int i = l - 1, j = r + 1, x = a[(l + r)/2];
        while(i < j){
            do i++; while(a[i] < x);
            do j--; while(a[j] > x);
            if(i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        quicksort(a,l,j);
        quicksort(a,j+1,r);
    }
}
