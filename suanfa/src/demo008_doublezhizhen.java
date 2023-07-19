import java.util.Scanner;

public class demo008_doublezhizhen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[100010];
        int []s=new int[100010];
        int res=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0,j=0; i <n ; i++) {
            s[a[i]]++;
            while (j<i&&s[a[i]]>1){
                s[a[j]]--;
                j++;
            }
            res=Math.max(res,i-j-1);

        }
        System.out.println(res);
    }

}
