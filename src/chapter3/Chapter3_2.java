package chapter3;

import java.util.Scanner;

public class Chapter3_2 {
    public static void main(String[] args) {
        // 정숫값을 입력 받아 절댓값을 표시
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int x = scn.nextInt();

        if (x < 0) {
            x *= -1;
        }
        System.out.println("절댓값은 " + x);
    }
}
