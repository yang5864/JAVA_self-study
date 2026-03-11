import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);   //도감 갯수
        int M = Integer.parseInt(input[1]);   //맞춰야하는 포켓몬 수

        String[] list = new String[N];
        HashMap<String, Integer> map = new HashMap<>(); //String(포켓몬 명)이 키, Integer(도감번호)가 값

        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
            map.put(list[i], i+1);
        }

        for (int i = 0; i < M; i++) {
            String target = br.readLine();
            if (Character.isDigit(target.charAt(0))) { //정수인 경우
                int num = Integer.parseInt(target);
                sb.append(list[num - 1]).append("\n");
            } else {    //포켓몬명인 경우
                sb.append(map.get(target)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
