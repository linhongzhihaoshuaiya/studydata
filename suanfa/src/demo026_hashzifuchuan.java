import java.util.Scanner;

public class demo026_hashzifuchuan {
    static int N=10010,P=131;
    static long[] h=new long[N];
    static long[] p=new long[N];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();

        p[0]=1;
        for (int i = 1; i <=n ; i++) {
            p[i]=p[i-1]*P;
            h[i]=h[i-1]*P+s.charAt(i-1);
            int x= (int) Math.pow(2,5);

        }
        while (m-->0){
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            int l2=sc.nextInt();
            int r2=sc.nextInt();
            if(get(l1,r1)==get(l2,r2)) System.out.println("Yes");
            else System.out.println("No");

        }

    }
    public static long get(int l,int r){
        return h[r]-h[l-1]*p[r-l+1];
    }
}
