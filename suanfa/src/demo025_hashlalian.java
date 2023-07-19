import java.util.Arrays;
import java.util.Scanner;

public class demo025_hashlalian {
    static int N=100003;
    static int[] h=new int[N];
    static int[] e=new int[N];
    static int[] ne=new int[N];
    static int index;

    public static void main(String[] args) {
        Arrays.fill(h,-1);
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        while (m-->0){
            String s=sc.next();
            int x=sc.nextInt();
            if(s.equals("I")){
                Insert(x);
            }
            else {
                if(find(x)) System.out.println("Yes");
                else System.out.println("No");
            }

        }


    }
    public static void Insert(int x){
        int k=Math.abs(x)%N;
        e[index]=x;
        ne[index]=h[k];
        h[k]=index++;
    }
    public static boolean find(int x){
        int k=Math.abs(x)%N;
        for (int i = h[k]; i !=-1 ; i=ne[i]) {
            if(e[i]==x) return true;
        }
        return false;
    }


}
