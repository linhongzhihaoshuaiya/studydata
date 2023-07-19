import java.util.Scanner;

public class demo003_erfenxiaoshu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double x=sc.nextDouble();
       double l=0,r=x;
       while (r-l>1e-8){
           double mid=(r+l)/2;
           if(mid*mid*mid>x) r=mid;
           else l=mid;
       }
       String s=String.format("%.6f",r);
        System.out.println(s);
    }
}
