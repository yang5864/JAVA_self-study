import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution_GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int lostSize = lost.length;
        int reserveSize = reserve.length;
        int answer = n - lostSize;

        for (int i = 0; i < lostSize; i++) {
            for (int j = 0; j < reserveSize; j++) {
                if (reserve[j] == lost[i]) {    // 여벌 있는 학생이 도난당한 경우
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
            if (lost[i] == -1) continue;    // 여벌 있는데 도난당한 경우 스킵
            for (int j = 0; j < reserveSize; j++) {
                if (((lost[i] + 1) == reserve[j]) || ((lost[i] - 1) == reserve[j])) {
                    answer += 1;
                    reserve[j] = -1;    //이미 나눠줬으니까 없음 이제
                    break;
                }
            }
        }
        return answer;
    }
}