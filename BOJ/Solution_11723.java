import java.io.*;
import java.util.*;

public class Solution_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferReader에서 한 줄 전체를 문자열로 읽음(ex: "add 3" 한 줄 전체)
        StringBuilder sb = new StringBuilder();
        //println ㅈㄴ 느려서 대용

        int M = Integer.parseInt(br.readLine());
        String calculation;
        int x;
        int[] S = new int[21];

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            //StringTokenizer에서 br에서 읽은거 분리(ex: "add 3" -> "add", "3")
            calculation = st.nextToken();
            //st에서 쪼갠 첫번째 값 들어감(ex: add)

            if (!calculation.equals("all") && !calculation.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
                //st에서 쪼갠 두번째 값 들어감(ex: 3)
                //Integer.parseInt -> 문자열로 br에서 가져왔으므로 정수형으로 변환
            } else {
                x = 0;
            }

            switch (calculation) {
                case "add":
                    if (S[x] == 0) {
                        S[x]++;
                    }
                    // [비트마스크 방식]
                    // int bitSet = 0;
                    // bitSet |= (1 << x);
                    // 설명:
                    // 1 << x 는 x번째 비트를 1로 만든 값
                    // |= 는 OR 연산으로 해당 비트를 켜는 역할
                    break;

                case "remove":
                    if (S[x] != 0) {
                        S[x] = 0;
                    }
                    // [비트마스크 방식]
                    // bitSet &= ~(1 << x);
                    // 설명:
                    // 1 << x 로 x번째 비트를 만든 뒤
                    // ~ 로 비트를 뒤집어서 x번째만 0, 나머지는 1로 만든다
                    // &= 연산으로 해당 비트만 끄게 된다
                    break;

                case "check":
                    if (S[x] == 0) {
                        sb.append("0\n");
                        // String처럼 새로운 객체를 만들지 않고, 내부 버퍼에 문자열을 추가하는 방식이라 성능이 훨씬 효율적입니다.
                        //append가 '추가'라는 뜻. 즉, 문자열 뒤에 붙인다는 뜻.
                    } else {
                        sb.append("1\n");
                    }
                    // [비트마스크 방식]
                    // if ((bitSet & (1 << x)) == 0) sb.append("0\n");
                    // else sb.append("1\n");
                    // 설명:
                    // & 연산으로 x번째 비트만 확인
                    // 결과가 0이면 집합에 없음
                    break;

                case "toggle":
                    if (S[x] == 0) {
                        S[x]++;
                    } else {
                        S[x] = 0;
                    }
                    // [비트마스크 방식]
                    // bitSet ^= (1 << x);
                    // 설명:
                    // XOR 연산
                    // 비트가 0이면 1로, 1이면 0으로 뒤집는다
                    break;

                case "all":
                    for (int i = 1; i < 21; i++) {
                        S[i] = 1;
                    }
                    // [비트마스크 방식]
                    // bitSet = (1 << 21) - 2;
                    // 설명:
                    // 1~20 비트를 전부 1로 만든 값
                    // (0번째 비트는 사용하지 않기 때문에 제외)
                    break;

                case "empty":
                    for (int i = 1; i < 21; i++) {
                        S[i] = 0;
                    }
                    // [비트마스크 방식]
                    // bitSet = 0;
                    // 설명:
                    // 모든 비트를 0으로 만들어 공집합 상태
                    break;
            }
        }

        System.out.print(sb);
        //한번에 출력
    }
}
