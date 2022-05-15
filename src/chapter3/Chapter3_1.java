package chapter3;

import java.util.Scanner;

public class Chapter3_1 {
    public static void main(String[] args) {
        // 키보드로 입력한 정숫값이 음인지 확인하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");
        int x = scn.nextInt();

        if (x < 0) {
            System.out.println("음수 입니다.");
        }
    }
}
