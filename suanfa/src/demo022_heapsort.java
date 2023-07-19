import java.util.Scanner;

public class demo022_heapsort {
    static int [] h=new int[10010];
    static int size;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        size=n;
        for (int i = 1; i <=n ; i++) {
            h[i]=sc.nextInt();
        }
        for (int i =n/2; i >=1 ; i--) {
            down(i);
        }


        while (m-->0){
            System.out.print(h[1]+" ");
            h[1]=h[size];
            size--;
            down(1);
        }

    }
    public static void down(int u){
        int t=u;
        if(2*u<=size&&h[u]>h[2*u]) t=2*u;
        if(2*u+1<size&&h[t]>h[2*u+1]) t=2*u+1;
        if(t!=u){
            int w=h[u];
            h[u]=h[t];
            h[t]=w;
            down(t);
        }


    }

}
