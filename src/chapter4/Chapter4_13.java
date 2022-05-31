package chapter4;

import java.util.Scanner;

public class Chapter4_13 {
    public static void main(String[] args) {
        // 0부터 양의 정수까지 카운트업하는 프로그램
        Scanner scn = new Scanner(System.in);
        int x;
        do {
            System.out.println("몇까지 카운트업 할까? : ");
            x = scn.nextInt();
        } while (x <= 0);

        for (int i = 0 ; i <= x ; i++) {
            System.out.println(i);
        }
    }
}
