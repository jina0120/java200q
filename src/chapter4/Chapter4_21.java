package chapter4;

import java.util.Scanner;

public class Chapter4_21 {
    public static void main(String[] args) {
        // *을 나열해서 n단의 정방형을 표시하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정방형의 단수를 입력해주세요. : ");
        int x = scn.nextInt();

        for (int j = 1 ; j <= x ; j++) {
            for (int i = 1 ; i <= x ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
