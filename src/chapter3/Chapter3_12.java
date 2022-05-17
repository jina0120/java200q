package chapter3;

import java.util.Scanner;

public class Chapter3_12 {
    public static void main(String[] args) {
        // 2개의 실숫값 중 큰 값을 표시하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("실숫값 a : ");
        double a = scn.nextDouble();
        System.out.println("실숫값 b : ");
        double b = scn.nextDouble();

        double max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(String.format("큰 값은 %f", max));
    }
}
