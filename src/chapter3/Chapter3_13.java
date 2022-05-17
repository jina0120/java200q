package chapter3;

import java.util.Scanner;

public class Chapter3_13 {
    public static void main(String[] args) {
        // 2개의 정숫값을 입력받아 두 값의 차를 표시하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정수 a : ");
        int a = scn.nextInt();
        System.out.println("정수 b : ");
        int b =scn.nextInt();

        System.out.println("두 값의 차는 " + (a>b ? a-b : b-a));
    }
}
