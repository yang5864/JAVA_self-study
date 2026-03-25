import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution_intercept {
    class Solution {
        public int solution(int[][] targets) {


            // 끝점 기준 오름차순 정렬 (2차원 배열 정렬)
            Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1])) ;

            int answer = 0;
            int endPoint = -1;

            for (int[] target : targets) {
                int start = target[0];
                int end = target[1];
                if (start >= endPoint) {    //새 요격 필요한 경우(안 겹치는 경우)
                    answer++;
                    endPoint = end;
                }
            }

            return answer;
        }
    }
}
