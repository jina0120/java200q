package chapter4;

import java.util.Scanner;

public class Chapter4_8 {
    public static void main(String[] args) {
        // 읽은 값의 개수 만큼 *와 +를 번갈아가며 표시하는 프로그램, 마지막줄에는 줄바꿈 출력
        Scanner scn = new Scanner(System.in);

        System.out.println("몇 개를 출력할까? : ");
        int n = scn.nextInt();

        int i = 1;

        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print("*");
            } else {
                System.out.print("+");
            }
            i++;
        }
        System.out.println();
    }
}
