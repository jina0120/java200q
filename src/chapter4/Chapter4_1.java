package chapter4;

import java.util.Scanner;

public class Chapter4_1 {
    public static void main(String[] args) {
        // 정숫값의 부호를 판정해서 표시하는 프로그램(3-5)를 원하는 만큼 반복해서 입력 하도록 수정
        Scanner scn = new Scanner(System.in);

        int retry;
        do {
            System.out.println("정숫값을 입력해 주세요. : ");
            int x = scn.nextInt();

            if (x == 0) {
                System.out.println("이 값은 0입니다.");
            } else if (x > 0) {
                System.out.println("이 값은 양수입니다.");
            } else {
                System.out.println("이 값을 음수입니다.");
            }

            System.out.println("다시 실행하시겠습니까? 1 - Yes / 0 - No");
            retry = scn.nextInt();
        } while (retry == 1);
    }
}
