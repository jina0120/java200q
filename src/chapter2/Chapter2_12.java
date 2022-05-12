package chapter2;

import java.util.Random;
import java.util.Scanner;

public class Chapter2_12 {
    public static void main(String[] args) {
        // 키보드에서 입력한 값의 +5 or -5 범위의 랜덤 정숫값 생성
        Scanner scn = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("정수값 : ");
        int x = scn.nextInt();

        System.out.println("정수의 -5에서 정수의 +5까지의 랜덤 정숫값 = " + (x - 5 + rd.nextInt(11)));
    }
}
