package chapter4;

import java.util.Scanner;

public class Chapter4_18 {
    public static void main(String[] args) {
        // 입력한 정숫값의 모든 약수와 그 개수를 표시하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int x = scn.nextInt();

        // 약수 개수 카운트
        int count = 0;

        for (int i = 1 ; i <= x ; i++) {
            if (x % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("약수의 개수는 " + count);
    }
}
