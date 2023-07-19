import java.util.Scanner;

public class demo013_monizhan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] stk=new int[100010];
        int tt=0;//元素从下标1开始存储，下表为0，表示栈为空
        int m=sc.nextInt();
        while (m-->0){
            String s=sc.next();
            if(s.equals("push")){
                int x=sc.nextInt();
                stk[++tt]=x;
            }
            else if(s.equals("pop")){
               tt--;

            }
            else if(s.equals("empty")){
                if(tt==0) System.out.println("YES");
                else System.out.println("NO");

            }
            else {
                System.out.println(stk[tt]);

            }

        }
    }
}
