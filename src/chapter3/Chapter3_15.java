package chapter3;

import java.util.Scanner;

public class Chapter3_15 {
    public static void main(String[] args) {
         // 3개의 정수를 입력받아 최솟값을 구하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정수 a : ");
        int a = scn.nextInt();
        System.out.println("정수 b : ");
        int b = scn.nextInt();
        System.out.println("정수 c : ");
        int c = scn.nextInt();

        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println("최솟값은 " + min);
    }
}
