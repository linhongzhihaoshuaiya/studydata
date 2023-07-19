import java.util.Scanner;

public class demo014_moniduilie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] queue=new int[100010];
        int hh=0;int tt=-1;
        int m=sc.nextInt();
        while (m-->0){
            String s=sc.next();
            if(s.equals("push")){
                int x=sc.nextInt();
                queue[++tt]=x;
            }
            else  if(s.equals("pop")){
                hh++;

            }
            else if(s.equals("empty")){
                if(tt<hh) System.out.println("YES");
                else System.out.println("NO");

            }
            else {
                System.out.println(queue[hh]);

            }



        }
    }
}
