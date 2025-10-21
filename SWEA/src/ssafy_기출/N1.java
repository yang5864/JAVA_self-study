package ssafy_기출;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int [] box = new int[N];
        for (int i = 0; i < N; i++) {
            box[i] = sc.nextInt();
        }
        int sum = 0;
        int left = 0;
        int right = N - 1;
        int count = 0;
        while (sum < T) {
            if (box[left] < box[right]) {
                sum += box[right];
                right--;
            } else {
                sum += box[left];
                left++;
            }
            count++;
        }
        System.out.println("정답: " + count);
    }
}
