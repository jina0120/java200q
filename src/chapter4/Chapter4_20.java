package chapter4;

import java.util.Scanner;

public class Chapter4_20 {
    public static void main(String[] args) {
        // 달을 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램.
        // 원하는 만큼 입력, 출력, 1-12외의 달이 들어올 경우 재입력
        Scanner scn = new Scanner(System.in);

        int month;
        int retry;
        do {
            do {
                System.out.println("달을 입력해주세요 : ");
                month = scn.nextInt();
            } while (month < 1 || month > 12);

            if (month >= 3 && month <= 5) {
                System.out.println("봄");
            } else if (month >= 6 && month <= 8) {
                System.out.println("여름");
            } else if (month >= 9 && month <= 11) {
                System.out.println("가을");
            } else {
                System.out.println("겨울");
            }

            System.out.println("다시 계절을 보려면 1, 보지 않으려면 0");
            retry = scn.nextInt();
        } while (retry == 1);
    }
}
