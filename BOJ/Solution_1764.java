import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> neverHeard = new HashSet<>();
        HashSet<String> neverSeen = new HashSet<>();

        for (int i = 0; i < N; i++) {
            neverHeard.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            neverSeen.add(br.readLine());
        }

        neverSeen.retainAll(neverHeard);

        List<String> list = new ArrayList<>(neverSeen);

        Collections.sort(list);

        sb.append(neverSeen.size()).append("\n");
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
