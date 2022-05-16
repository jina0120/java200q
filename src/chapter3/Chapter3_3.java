package chapter3;

import java.util.Scanner;

public class Chapter3_3 {
    public static void main(String[] args) {
        // 2개의 양의 정수 A와 B를 입력 받아 B가 A의 약수라면 "B는 A의 약수이다." 출력, 그렇지 않다면 "B는 A의 약수가 아니다." 출력
        Scanner scn = new Scanner(System.in);

        System.out.println("A를 입력해주세요. : ");
        int a = scn.nextInt();
        System.out.println("B를 입력해주세요. : ");
        int b = scn.nextInt();

        if (a % b == 0) {
            System.out.println("B는 A의 약수이다.");
        } else {
            System.out.println("B는 A의 약수가 아니다.");
        }
    }
}
