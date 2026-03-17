import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] man = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            man[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (man[i] > man[j]) {
                    int tmp = man[i];
                    man[i] = man[j];
                    man[j] = tmp;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                result += man[j];
            }
        }

        System.out.println(result);
    }
}
