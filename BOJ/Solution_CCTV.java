import java.util.Arrays;

public class Solution_CCTV {
    class Solution {
        public int solution(int[][] routes) {
            Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1])) ;

            int answer = 0;
            int endPoint = -30001;

            for (int[] route : routes) {
                int start = route[0];   // 반복 될 때 마다 2차원 배열 i행 1번째 요소
                int end = route[1];     // 반복 될 때 마다 2차원 배열 i행 2번째 요소
                if (start > endPoint) {
                    answer++;
                    endPoint = end;
                }
            }

            return answer;
        }
    }
}
