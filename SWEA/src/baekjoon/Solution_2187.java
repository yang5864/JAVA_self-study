package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Solution_2187 {
    static int N, M;
    static int[][] map;
    static int[][] dist;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();    //ex) "101111"
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(dist[N-1][M-1]);
    }

    static void bfs(int sx, int sy) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy});
        dist[sx][sy] = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();   //큐 맨 앞에 있는 원소 꺼내 반환 후, 큐에서 제거
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                //map 밖으로 나가면 스킵
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                // 이동할 칸이 0(막혀 있으면) 스킵
                if (map[nx][ny] == 0) continue;
                //이미 방문한 칸이면 스킵
                if (dist[nx][ny] != 0) continue;

                //처음 가는 길이면 현재 칸 까지의 거리 dist[x][y]에 +1 해서 저장
                dist[nx][ny] = dist[x][y] + 1;
                q.add(new int[]{nx, ny});   //현재 새로 도착한 좌표 큐에 넣음 -> 또 4방향 탐색
            }
        }
    }
}
