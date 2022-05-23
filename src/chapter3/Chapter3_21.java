package chapter3;

import java.util.Scanner;

public class Chapter3_21 {
    public static void main(String[] args) {
        // 월을 정숫값으로 받아 해당하는 계절을 표시하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("몇 월 인가요?");
        int month = scn.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못 된 월 입니다.");
                break;

        }
    }
}
