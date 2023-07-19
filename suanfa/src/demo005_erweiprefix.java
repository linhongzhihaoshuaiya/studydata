import java.util.Scanner;

public class demo005_erweiprefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        int[][]a=new int[n+1][m+1];
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m; j++) {
                a[i][j]=sc.nextInt();
            }
            }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m; j++) {
                a[i][j]=a[i][j]+a[i-1][j]+a[i][j-1]-a[i-1][j-1];
            }
        }

        for (int i = 0; i < q; i++) {
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            System.out.println(a[x2][y2]-a[x1-1][y2]-a[x2][y1-1]+a[x1-1][y1-1]);

        }
            
        }
    }

