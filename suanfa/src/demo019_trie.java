import java.util.Scanner;

/*trie树下标0作为根节点，每次从根节点开始遍历*/
public class demo019_trie {
    static int N = 100000;
    static int[][] son = new int[N][26];
    static int cnt[] = new int[N];
    static int index;
/*判断这个串是否出现过且出现几次*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.equals("I")) {
                Insert(s2.toCharArray());
            } else {
                System.out.println(Query(s2.toCharArray()));
            }

        }

    }

    public static void Insert(char[] str) {
        int p = 0;
        for (int i = 0; i < str.length; i++) {
            int u = str[i] - 'a';
            if (son[p][u] == 0) son[p][u] = ++index;//index既可以用来表示已存在点又可以表示树上有多少个点
            p = son[p][u];
        }
        cnt[p]++;

    }

    public static int Query(char[] str) {
        int p = 0;
        for (int i = 0; i < str.length; i++) {
            int u = str[i] - 'a';
            if (son[p][u] == 0) return 0;
            p = son[p][u];
        }
        return cnt[p];
    }
}