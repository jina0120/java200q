package chapter3;

import java.util.Scanner;

public class Chapter3_7 {
    public static void main(String[] args) {
        // 변수 2개를 입력 받아 대소 관계 출력하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("변수 a : ");
        int a = scn.nextInt();
        System.out.println("변수 b : ");
        int b = scn.nextInt();

        if (a > b) {
            System.out.println("a가 크다.");
        } else if (a < b) {
            System.out.println("b가 크다.");
        } else {
            System.out.println("a와 b가 같다.");
        }
    }
}
