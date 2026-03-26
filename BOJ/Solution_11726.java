import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i-2]) % 10007;  // 나중에 mod하면 int 값 초과할수도 있다.
            //DP에서 서로 다른 케이스(겹치지 않는 경우의 수) -> 더한다!!!
            // 1. 마지막 선택 기준으로 나누면 서로 겹치지 않는다
            // 2. dp[n] =
            //    마지막이 1 → dp[n-1]
            //  + 마지막이 2 → dp[n-2]
            //  + 마지막이 3 → dp[n-3]
        }

        System.out.println(dp[n]);
    }
}
