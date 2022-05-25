package chapter4;

import java.util.Scanner;

public class Chapter4_5 {
    public static void main(String[] args) {
        // 입력받은 정숫값부터 0까지 카운트다운하는 프로그램. 종료 후 변숫값도 확인할 수 있는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("카운트다운 : ");
        int x = scn.nextInt();

        while (x >= 0) {
            System.out.println(x);
            x--;
        }
        System.out.println("x의 값은 " + x);
    }
}
