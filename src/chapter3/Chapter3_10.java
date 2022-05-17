package chapter3;

import java.util.Scanner;

public class Chapter3_10 {
    public static void main(String[] args) {
        // 입력받은 정숫값을 3으로 나누고 "이 값은 3으로 나누어집니다.",
        // "이 값을 3으로 나눈 나머지는 1입니다.", "이 값을 3으로 나눈 나머지는 2입니다." 중 하나를 표시하는 프로그램
        // 양수가 아닌 경우 "양수가 아닌 값을 입력했습니다." 출력
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int x = scn.nextInt();

        if (x > 0) {
            if (x % 3 == 0) {
                System.out.println("이 값은 3으로 나누어집니다.");
            } else if (x % 3 == 1) {
                System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
            } else {
                System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
            }
        } else {
            System.out.println("양수가 아닌 값을 입력했습니다.");
        }
    }
}
