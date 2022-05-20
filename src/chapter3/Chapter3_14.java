package chapter3;

import java.util.Scanner;

public class Chapter3_14 {
    public static void main(String[] args) {
        // 두 정숫값의 차가 10이하인 경우 "두 값의 차는 10이하입니다.", 그렇지 않으면 "두 값의 차는 11이상입니다." 출력 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 a : ");
        int a = scn.nextInt();
        System.out.println("정숫값 b : ");
        int b = scn.nextInt();

        int c = (a > b ? a-b : b-a);
        System.out.println("두 값의 차는 " + (c >= 10 ? "11이상" : "10이하") + "입니다.");
    }
}
