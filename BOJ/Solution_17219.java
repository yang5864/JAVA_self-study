import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Solution_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   //저장된 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken());   //찾으려는 사이트 주소의 숰

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String site = st.nextToken();
            String password = st.nextToken();

            map.put(site, password);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            String targetSite = st.nextToken();
            String targetPassword = map.get(targetSite);
            System.out.println(targetPassword);
        }
    }
}
