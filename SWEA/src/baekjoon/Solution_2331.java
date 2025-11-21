package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2331 {
    static int A, P;
    static int[] visited;
    static int p;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        visited = new int[1000000];

        int result = dfs(A, 1);
        System.out.println(result);
    }

    static int dfs(int num, int depth) {
        if (visited[num] != 0) {
            return visited[num] - 1;
        }
        visited[num] = depth;

        int nextNum = next(num);
        return dfs(nextNum, depth + 1);
    }

    static int next(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            int pow = 1;
            for (int i = 0; i < P; i++) {
                pow *= digit;
            }
            sum += pow;
        }
        return sum;
    }
}
