import java.util.*;

public class demo028_lisanhua {
    static int N = 300010;
    static int[] a = new int[N];
    static int[] s = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> alls = new ArrayList<>();
        List<Pair> add = new ArrayList<>();
        List<Pair> query = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int c = sc.nextInt();
            add.add(new Pair(x, c));
            alls.add(x);
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            query.add(new Pair(l, r));
            alls.add(l);
            alls.add(r);
        }
        Collections.sort(alls);
        int j = unique(alls);
        alls = alls.subList(0, j);
        for (Pair pair : add) {
            int index = find(pair.x, alls);
            a[index] += pair.y;
        }
        for (int i = 1; i <= alls.size(); i++) {
            s[i] = s[i - 1] + a[i];

        }
        for (Pair pair : query) {
            int l = find(pair.x, alls);
            int r = find(pair.y, alls);
            System.out.println(s[r] - s[l - 1]);
        }


    }

    public static int find(int x, List<Integer> list) {
        int l = 0;
        int r = list.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (list.get(mid) >= x) r = mid;
            else l = mid + 1;

        }
        return l + 1;
    }

    public static int unique(List<Integer> list) {
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || list.get(i) != list.get(i - 1)) {
                list.set(j, list.get(i));
                j++;
            }
        }
        return j;
    }

}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
