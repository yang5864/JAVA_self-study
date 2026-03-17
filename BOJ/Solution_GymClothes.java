import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution_GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int lostSize = lost.length;
        int reserveSize = reserve.length;
        int answer = n - lostSize;

        for (int i = 0; i < lostSize; i++) {
            for (int j = 0; j < reserveSize; j++) {
                if (reserve[j] == lost[i]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lostSize; i++) {
            if (lost[i] == -1) continue;
            for (int j = 0; j < reserveSize; j++) {
                if (((lost[i] + 1) == reserve[j]) || ((lost[i] - 1) == reserve[j])) {
                    answer += 1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}