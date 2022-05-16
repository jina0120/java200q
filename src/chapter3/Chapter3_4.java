package chapter3;

import java.util.Scanner;

public class Chapter3_4 {
    public static void main(String[] args) {
        // 3_3을 논리 부정 연산자(!)를 사용해서 만들어보자
        Scanner scn = new Scanner(System.in);

        System.out.println("A를 입력해주세요. : ");
        int a = scn.nextInt();
        System.out.println("B를 입력해주세요. : ");
        int b = scn.nextInt();

        if (!(a % b == 0)) {
            System.out.println("B는 A의 약수가 아니다.");
        } else {
            System.out.println("B는 A의 약수이다.");
        }
    }
}
