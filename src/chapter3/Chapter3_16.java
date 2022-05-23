package chapter3;

import java.util.Scanner;

public class Chapter3_16 {
    public static void main(String[] args) {
        // 3개의 정숫값을 입력받아 중앙값을 출력하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정수 a : ");
        int a = scn.nextInt();
        System.out.println("정수 b : ");
        int b = scn.nextInt();
        System.out.println("정수 c : ");
        int c = scn.nextInt();
        int mid;

        if (a >= b) {               // a >= b
            if (b >= c) {
                mid = b;            // a >= b >= c
            } else if (a >= c){     // a >= b, c > b, 최솟값은 b, a와 c의 대소 비교 차례
                mid = c;            // a >= c > b
            } else {                // a >= b, c > b, c > a
                mid = a;            // c > a >= b
            }
        } else {                    // b > a
            if (a >= c) {
                mid = a;            // b > a >= c
            } else if (b >= c) {    // b > a, c > a, 최솟값은 a, b와 c의 대소 비교 차례
                mid = c;            // b >= c > a
            } else {                // b > a, c > b. 즉 c > b > a
                mid = b;            // c > b > a
            }
        }

        System.out.println("중앙값은 " + mid);
    }
}
