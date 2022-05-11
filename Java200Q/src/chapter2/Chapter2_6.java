package chapter2;

import java.util.Scanner;

public class Chapter2_6 {
    public static void main(String[] args) {
        // 키보드에서 입력한 정숫값에 10을 더하거나 뺀 값 표시
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int x = scn.nextInt();
        System.out.println("10을 더한 값 = " + (x + 10));
        System.out.println("10을 뺀 값 = " + (x - 10));
    }
}
