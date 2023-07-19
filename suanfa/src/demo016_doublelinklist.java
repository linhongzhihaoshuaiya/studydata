import java.util.Scanner;

public class demo016_doublelinklist {
    static int N = 100010;
    static int[] e = new int[N];
    static int[] l = new int[N];
    static int[] r = new int[N];
    static int index = 1;//0,1作为区间

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r[0] = 1;
        l[1] = 0;//双链表一定要确定区间
        int m = sc.nextInt();
        while (m-- > 0) {
            String s = sc.next();
            if (s.equals("L")) {
                int x = sc.nextInt();
                Insert(0, x);

            } else if (s.equals("R")) {
                int x = sc.nextInt();
                Insert(l[1], x);

            } else if (s.equals("D")) {
                int k = sc.nextInt();
                Delete(k + 1);

            } else if (s.equals("IL")) {
                int k = sc.nextInt();
                int x = sc.nextInt();
                Insert(l[k + 1], x);

            } else {
                int k = sc.nextInt();
                int x = sc.nextInt();
                Insert(k + 1, x);

            }
        }
        for (int i = r[0]; i != 1; i = r[i]) {
            System.out.print(e[i] + " ");

        }

    }

    public static void Insert(int k, int x) {//在下标为k的后面插入X
        index++;
        e[index] = x;
        r[index] = r[k];
        l[index] = k;
        l[r[k]] = index;
        r[k] = index;


    }

    public static void Delete(int k) {//删除下标为k
        l[r[k]] = l[k];
        r[l[k]] = r[k];


    }
}