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
        int cnt = 0;

        HashSet<String> neverHeard = new HashSet<>();
        HashSet<String> neverSeen = new HashSet<>();

        for (int i = 0; i < N; i++) {
            neverHeard.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            neverSeen.add(br.readLine());
        }

        for (String s : neverSeen) {
            if (neverHeard.contains(s)){
                cnt++;
            }
        }

        neverSeen.retainAll(neverHeard);

        List<String> list = new ArrayList<>(neverSeen);

        Collections.sort(list);

        System.out.println(cnt);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
