import java.util.Scanner;

public class demo012_danlianbiao {
    static int N = 100010;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int index;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0) {
            String s = sc.next();
            if (s.equals("I")) {
                int k = sc.nextInt();
                int x = sc.nextInt();
                Insert(k, x);

            } else if (s.equals("D")) {
                int k = sc.nextInt();
                Delete(k);

            } else {
                int x = sc.nextInt();
                Insert(0, x);

            }

        }
        for (int i = ne[0]; i != 0; i = ne[i]) {
            System.out.print(e[i] + " ");

        }

    }

    public static void Insert(int k, int x) {//下标k后面插入x
        index++;
        e[index] = x;
        ne[index] = ne[k];
        ne[k] = index;
    }

    public static void Delete(int k) {//删除下标为K后面的一个数
        ne[k] = ne[ne[k]];
    }
}