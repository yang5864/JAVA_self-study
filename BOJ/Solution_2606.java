import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int comNum = Integer.parseInt(br.readLine());   // 전체 컴퓨터의 수
        int linkedComNum = Integer.parseInt(br.readLine()); // 연결된 컴퓨터 쌍의 수

        ArrayList<Integer>[] graph = new ArrayList[comNum + 1]; // 직접적으로 연결된 컴퓨터끼리 graph로 정리

        for (int i = 0; i <= comNum; i++) { // 한번 초기화 해줌
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < linkedComNum; i++) {    // graph 마다 연결된거 추가
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        Queue<Integer> q = new LinkedList<>();  // 큐로 간접 연결된거까지도 넣어주려고
        q.add(1);
        boolean[] visited = new boolean[comNum+1];
        visited[1] = true;
        
        while(!q.isEmpty()) {   // 큐에 더이상 남은게 없을 때까지
            int cur = q.poll(); // 1부터 검사하기 + 큐에서 1삭제

            for (Integer i : graph[cur]) {  // 1과 연결된 2, 5에 true 하고 큐에 넣음.
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

        int answer = -1;    // 1 본인은 뺴야하니까 미리 -1로 해줌.

        for (boolean b : visited) {
            if (b) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
