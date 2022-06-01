package chapter4;

import java.util.Scanner;

public class Chapter4_19 {
    public static void main(String[] args) {
        // 1부터 n까지 정숫값에 각 값을 제곱해서 표시하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("n을 입력 : ");
        int n = scn.nextInt();

        for (int i = 1 ; i <= n ; i++) {
            System.out.printf("%d의 제곱은 %d", i, i*i).println();
        }
    }
}
