package chapter3;

import java.util.Scanner;

public class Chapter3_8 {
    public static void main(String[] args) {
        // 입력받은 정숫값이 5로 나누어떨어지면 "이 값은 5로 나누어집니다." 그렇지 않다면 "이 값은 5로 나누어지지 않습니다." 출력하는 프로그램
        // 음수를 입력한 경우에는 "음의 정숫값을 입력했습니다." 출력
        Scanner scn = new Scanner(System.in);

        System.out.println("정숫값 입력 : ");
        int x = scn.nextInt();

        if (x > 0) {
            if (x % 5 == 0) {
                System.out.println("이 값은 5로 나누어집니다.");
            } else {
                System.out.println("이 값은 5로 나누어지지 않습니다.");
            }
        } else {
            System.out.println("음의 정숫값을 입력했습니다.");
        }
    }
}
