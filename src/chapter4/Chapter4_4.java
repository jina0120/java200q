package chapter4;

import java.util.Scanner;

public class Chapter4_4 {
    public static void main(String[] args) {
        // 2개의 정숫값을 받아 두 정수 사이의 모든 정숫값을 작은 것부터 큰 순대로 출력하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정수 a : ");
        int a = scn.nextInt();
        System.out.println("정수 b : ");
        int b = scn.nextInt();

        if (a > b) {
            int n = a;
            a = b;
            b = n;
        }

        do {
            System.out.print(a + " ");
            a++;
        } while (a < b);
    }
}
