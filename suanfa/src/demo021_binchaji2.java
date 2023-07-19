import java.io.*;

public class demo021_binchaji2 {
    static int N=100010;
    static int [] p=new int[N];
    static int [] size=new int[N];
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s1=bf.readLine().split(" ");
        int n=Integer.parseInt(s1[0]);
        int m=Integer.parseInt(s1[1]);
        for (int i = 1; i <=n ; i++) {
            p[i]=i;
            size[i]=1;
        }
        while (m-->0){
            String[] s2=bf.readLine().split(" ");
            String op=s2[0];

            if(op.equals("C")){
                int a=Integer.parseInt(s2[1]);
                int b=Integer.parseInt(s2[2]);
                if(find(a)!=find(b))
                {
                    size[find(b)]+=size[find(a)];
                    p[find(a)]=find(b);

                }
            }
            else if(op.equals("Q1")){
                int a=Integer.parseInt(s2[1]);
                int b=Integer.parseInt(s2[2]);
                if(find(a)==find(b)) bw.write("Yes");
                else bw.write("No");
                bw.newLine();
            }
            else {
                int a=Integer.parseInt(s2[1]);

                bw.write(size[find(a)]+"");
                bw.newLine();



            }

        }
        bw.flush();




    }
    public static int find(int x){
        if(p[x]!=x) p[x]=find(p[x]);
        return p[x];
    }
}