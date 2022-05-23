package chapter3;

import java.util.Scanner;

public class Chapter3_19 {
    public static void main(String[] args) {
        // 3개의 정숫값을 입력 받아 오름차순으로 정렬하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 a : ");
        int a = scn.nextInt();
        System.out.println("정숫값 b : ");
        int b = scn.nextInt();
        System.out.println("정숫값 c : ");
        int c = scn.nextInt();

        // if들은 max값을 c로 올려주기
        if (a > b) {
            int n = a;
            a = b;
            b = n;
        }

        if (b > c) {
            int n = b;
            b = c;
            c = n;
        }

        // max값은 정해졌고 나머지 정수들끼리 비교
        if (a > b) {
            int n = a;
            a = b;
            b = n;
        }

        System.out.println("a <= b <= c순으로 정렬, a는 " + a + ", b는 " + b + ", c는 " + c);
    }
}
