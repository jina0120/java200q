package chapter4;

import java.util.Scanner;

public class Chapter4_14 {
    public static void main(String[] args) {
        // 1부터 n까지의 합을 구하는 프로그램. for문.
        Scanner scn = new Scanner(System.in);

        int x;
        int sum = 0;

        do {
            System.out.println("숫자를 입력해주세요. : ");
            x = scn.nextInt();
        } while (x <= 0);

        for (int i = 0 ; i <= x ; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d까지의 합은 %d", x, sum).println();
    }
}
