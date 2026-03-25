import java.util.PriorityQueue;

public class Solution_Overtime {
    class Solution {
        public long solution(int n, int[] works) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

            for (int work : works) {
                pq.add(work);
            }

            for (int i = 0; i < n; i++) {
                int max = pq.poll();
                if (max == 0) break;
                pq.add(--max);
            }

            long answer = 0;
            while(!pq.isEmpty()) {
                int x = pq.poll();
                answer += x * x;
            }

            return answer;
        }
    }
}
