package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 0;

        while (true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    balance = deposit(balance, sc.nextInt());
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    balance = withdraw(balance, sc.nextInt());
                    break;
                case 3:
                    checkBalance(balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("옳바르지 않은 선택입니다.(1~4 중 입력)");
                    break;
            }
        }
    }
    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if (balance < amount) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        return balance;
    }

    public static void checkBalance(int balance) {
        System.out.println("현재 잔액: " + balance + "원");
    }
}
