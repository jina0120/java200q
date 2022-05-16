package chapter3;

import java.util.Scanner;

public class Chapter3_5 {
    public static void main(String[] args) {
        // 정숫값을 입력 받아 양수/음수/0을 판정하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값을 입력해 주세요. : ");
        int x = scn.nextInt();

        if (x == 0) {
            System.out.println("값은 0입니다.");
        } else if (x > 0) {
            System.out.println("값은 양수입니다.");
        } else {
            System.out.println("값은 음수입니다.");
        }
    }
}
