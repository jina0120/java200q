package chapter4;

import java.util.Scanner;

public class Chapter4_17 {
    public static void main(String[] args) {
        // 읽은 숫자만큼 *을 출력하는 4_11을 변경해서 5개 단위로 줄바꿈하여 출력하는 프로그램
        Scanner scn = new Scanner(System.in);
        // 몫
        int x;

        do {
            System.out.println("* 몇개를 출력할까? : ");
            x = scn.nextInt();
        } while (x <= 0);

        // 나머지
        int y = x % 5;
        System.out.println("y = " + y);

        for (int i = 0 ; i <= x ; i += 5) {
            if (i / 5 > 0){
                System.out.println("*****");
            }
        }

        for (int i = 0 ; i < y ; i++) {
            System.out.print("*");
        }
    }
}
