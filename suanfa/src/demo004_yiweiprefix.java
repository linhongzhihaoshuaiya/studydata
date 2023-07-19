import java.util.Scanner;

public class demo004_yiweiprefix {
    public static void main(String[] args) {/*先算前缀和，再进行区间计算*/
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []a=new int[n+1];
        for (int i = 1; i <=n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i <=n; i++) {
            a[i]=a[i]+a[i-1];
        }
        for (int i = 0; i < m; i++) {
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(a[r]-a[l-1]);

        }
    }
}
