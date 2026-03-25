import java.util.PriorityQueue;

public class Solution_MoreSpicy {
    class Solution {
        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i : scoville) {
                pq.add(i);
            }

            int answer = 0;
            while(K > pq.peek()) {
                if (pq.size() < 2) return -1;
                int first = pq.poll();
                int second = 2 * pq.poll();

                pq.add(first + second);
                answer++;
            }
            return answer;
        }
    }
}
