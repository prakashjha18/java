import java.io.*;
import java.util.*;
public class cutthetrees{
    private static ArrayList<Integer>[] tree;
    public static int treedata[];
    public static boolean vis[];
    public static int n,u,v,total,ans;
    public static void main(String[] args) throws IOException  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        int n = Integer.parseInt(bufferedReader.readLine());
        tree = new ArrayList[n+1];
        treedata = new int[n+1];
        vis = new boolean[n+1];
        total =0;
        ans=1000000000+9;
        String[] dataItems = bufferedReader.readLine().split(" ");
        int j=0;
        for(int i=1;i<n+1;i++){
            treedata[i]=Integer.parseInt(dataItems[j++]);
            total+=treedata[i];
            tree[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i < n; i++) {
            String[] dataItms = bufferedReader.readLine().split(" ");
            int c1 = Integer.parseInt(dataItms[0]);
            int c2 = Integer.parseInt(dataItms[1]);
            tree[c1].add(c2);
            tree[c2].add(c1);
        }
        dfs(1);
        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
    private static int dfs(int city){
        vis[city] = true;
        int below = treedata[city];
        for (int c = 0; c < tree[city].size(); c++){
            if(!vis[tree[city].get(c)]){
                below=below+dfs(tree[city].get(c));
            }
        }
        if(Math.abs(total - (2*below)) < ans) {
            ans = Math.abs(total - (2*below));
        }
        return below;
    }
}
