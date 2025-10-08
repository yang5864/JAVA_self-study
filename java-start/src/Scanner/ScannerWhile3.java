package Scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요 (0 입력시 종료): ");
            int num = sc.nextInt();
            if (num == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += num;
        }
        System.out.println("현재까지 총합: " + sum);
    }
}
