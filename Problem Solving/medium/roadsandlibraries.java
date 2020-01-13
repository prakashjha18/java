import java.util.*;
public class roadsandlibraries {
    private static ArrayList<Integer>[] adjCities;
    private static int connectedComponents;
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int cities = in.nextInt();
            int roads = in.nextInt();
            int libCost = in.nextInt();
            int roadCost = in.nextInt();
            if (roadCost >= libCost || roads == 0){ 
                System.out.println(libCost * cities);
                for (int i = 0; i < (roads*2); i++){
                    in.nextInt();
                }
                continue;
            }
            else{
                adjCities = (ArrayList<Integer>[]) new ArrayList[cities+1];
                for (int c = 0; c <= cities; c++) {
                    adjCities[c] = new ArrayList<Integer>();
                }
                visited = new boolean[cities+1];
                for (int i = 0; i < roads; i++){
                    int c1 = in.nextInt();
                    int c2 = in.nextInt();
                    adjCities[c1].add(c2);
                    adjCities[c2].add(c1);
                }
                for(int c = 1; c <= cities; c++) {
                    if(!visited[c]) {
                        dfs(c);
                        connectedComponents++;
                    }
                }
                System.out.println(roadCost * (cities - connectedComponents) + libCost * connectedComponents);
                connectedComponents = 0;
                visited = new boolean[10000];
                adjCities = (ArrayList<Integer>[]) new ArrayList[10000+1];
            }
        }
    }
    private static void dfs(int city){
        visited[city] = true;
        for (int c = 0; c < adjCities[city].size(); c++){
            if(!visited[adjCities[city].get(c)]){dfs(adjCities[city].get(c));
            }
        }
    }
}
