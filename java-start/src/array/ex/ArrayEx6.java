package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num = sc.nextInt();

        int [] nums = new int[num];

        System.out.println(num + "개의 정수를 입력하세요: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int small, big;
        small = big = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (small > nums[i]) {
                 small = nums[i];
            }
            if (big < nums[i]){
                big = nums[i];
            }
        }
        System.out.println("가장 작은 정수: " + small);
        System.out.println("가장 큰 정수: " + big);
    }
}
