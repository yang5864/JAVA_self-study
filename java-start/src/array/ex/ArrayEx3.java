package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요: ");
        int [] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[nums.length - (i + 1)]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
