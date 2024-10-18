import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2644 {

    static Queue<Integer> q = new LinkedList<Integer>();
    static int visit[] ;
    static int n, m, start, end;
    static int graph[][];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        visit = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        dfs(start);

        if(visit[end] == 0) {
            System.out.println("-1");
        } else {
            System.out.println(visit[end]);
        }
    }

    public static void dfs(int start) {

        if(start == end) return;

        for(int i =1 ; i<=n ; i++) {
            if(graph[start][i] == 1 && visit[i] == 0) {
                visit[i] = visit[start] + 1;
                dfs(i);
            }
        }

    }
}