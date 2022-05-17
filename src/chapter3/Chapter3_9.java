package chapter3;

import java.util.Scanner;

public class Chapter3_9 {
    public static void main(String[] args) {
        // 입력받은 정숫값이 양수면 10의 배수인지 아닌지 출력하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int x = scn.nextInt();

        if (x > 0) {
            if (x % 10 == 0) {
                System.out.println("이 값은 10의 배수입니다.");
            } else {
                System.out.println("이 값은 10의 배수가 아닙니다.");
            }
        } else {
            System.out.println("음의 정숫값을 입력했습니다.");
        }
    }
}
