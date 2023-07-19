import java.util.Scanner;

public class demo015_dandiaozhan {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int [] stk=new int[10010];
      int m=sc.nextInt();
      int tt=0;
      while (m-->0){
          int x=sc.nextInt();
          while (tt!=0&&stk[tt]>=x) tt--;
          if(tt==0) System.out.print("-1 ");
          else System.out.print(stk[tt]+" ");
          stk[tt++]=x;
      }

    }
}
