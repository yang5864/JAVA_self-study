package D3;
/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;
// double b = 1.0;
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Solution_2806_Retry
{
    static int N;
    static int answer;
    static boolean[] col;
    static boolean[] diag1;
    static boolean[] diag2;
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            /////////////////////////////////////////////////////////////////////////////////////////////
			N = sc.nextInt();
            answer = 0;

            col = new boolean[N];
            diag1 = new boolean[2 * N];
            diag2 = new boolean[2 * N];

            dfs(0);

            System.out.println("#" + test_case + " " + answer);
            /////////////////////////////////////////////////////////////////////////////////////////////

        }
    }
    static void dfs(int row) {
        if (row == N) {
            answer++;
            return;
        }

        for (int i = 0; i < N; i++) {
            int d1 = row - i + (N - 1);
            int d2 = row + i;

            if (col[i]) continue;
            if (diag1[i]) continue;
            if (diag2[i]) continue;

            col[i] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            dfs(row + 1);

            col[i] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }
}