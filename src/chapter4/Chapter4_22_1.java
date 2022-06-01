package chapter4;

import java.util.Scanner;

public class Chapter4_22_1 {
    public static void main(String[] args) {
        // *를 나열해서 직각의 이등변 삼각형을 표시하는 프로그램 (왼쪽 아래가 직각인 이등변 삼각형.ver)
        Scanner scn = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다. 단수는? : ");
        int x = scn.nextInt();

        for (int j = 1 ; j <= x ; j++) {
            for (int i = 1 ; i <= j ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
