package Scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int num = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
