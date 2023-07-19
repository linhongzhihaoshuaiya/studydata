import java.util.*;

/*public class demo011_qujianmerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<pair> list = new ArrayList<>();
       for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            list.add(new pair(l, r));
        }
        Collections.sort(list);
        int res = merge(list);
        System.out.println(res);
    }


    /*public static int merge(List<pair> list) {
        List<pair> res = new ArrayList<>();
        int st = (int) -2e9;
        int ed = (int) -2e9;
        for (pair p : list) {
            if (ed < p.x) {
                if (ed != -2e9) res.add(new pair(st, ed));
                st = p.x;
                ed = p.y;
            } else ed = Math.max(ed, p.y);
        }
        if (ed != -2e9) res.add(new pair(st, ed));
        return res.size();
    }
}*/

/*class pair implements Comparable<pair> {
    int x, y;

    public pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(pair o) {
        return x - o.x;
    }
}*/