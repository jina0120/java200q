package chapter3;

import java.util.Scanner;

public class Chapter3_17 {
    public static void main(String[] args) {
        // 2개의 정숫값을 입력받아 작은 값과 큰 값을 표시하는 프로그램, 같으면 같다고 출력
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 a : ");
        int a = scn.nextInt();
        System.out.println("정숫값 b : ");
        int b = scn.nextInt();

        int max, min;

        if (a == b) {
            System.out.println("두 값이 같습니다.");
        } else {
            max = a > b ? a : b;
            min = a > b ? b : a;
            System.out.println("큰 값은 " + max + ", 작은 값은 " + min);
        }
    }
}
