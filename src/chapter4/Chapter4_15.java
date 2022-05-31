package chapter4;

import java.util.Scanner;

public class Chapter4_15 {
    public static void main(String[] args) {
        // 4_14를 수정해서 계산식까지 표시하는 프로그램
        Scanner scn = new Scanner(System.in);

        int x;
        int sum = 0;

        do {
            System.out.println("숫자를 입력해주세요. : ");
            x = scn.nextInt();
        } while (x <= 0);

        for (int i = 1 ; i < x ; i++) {
            sum += i;
            System.out.printf("%d + ", i);
        }
        sum += x;
        System.out.printf("%d = %d", x, sum);
    }
}
