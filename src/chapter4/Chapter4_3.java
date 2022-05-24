package chapter4;

import java.util.Random;
import java.util.Scanner;

public class Chapter4_3 {
    public static void main(String[] args) {
        // 2자리의 정숫값을 맞추는 숫자 맞추기 게임. 난수 생성, if, do 사용.
        // 1. 난수 생성
        // 2. 입력 받기
        // 3. 틀렸다면 do 다시 실행, 맞췄다면 정답 리턴
        Random r = new Random();
        Scanner scn = new Scanner(System.in);

        int rn = 10 + r.nextInt(90);
        int x;

        do {
            System.out.println("10 ~ 99 사이의 숫자를 맞추세요. : ");
            x = scn.nextInt();

            if (rn > x) {
                System.out.println("더 큰 숫자입니다.");
            } else if (rn < x) {
                System.out.println("더 작은 숫자입니다.");
            }
        } while (rn != x);
        System.out.println("정답입니다.");
    }
}
