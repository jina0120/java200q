package chapter2;

import java.util.Scanner;

public class Chapter2_8 {
    public static void main(String[] args) {
        // 입력받은 2개의 실숫값의 합과 평균 출력
        Scanner scn = new Scanner(System.in);

        System.out.println("실숫값 x : ");
        double x = scn.nextDouble();

        System.out.println("실숫값 y : ");
        double y = scn.nextDouble();

        System.out.println("x와 y의 합은 " + (x + y));
        System.out.println("x와 y의 평균은 " + (x + y)/2);
    }
}
