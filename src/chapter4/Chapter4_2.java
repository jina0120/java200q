package chapter4;

import java.util.Scanner;

public class Chapter4_2 {
    public static void main(String[] args) {
        // 3자리 양의 정숫값을 읽는 프로그램 (입력한 값이 3자리의 양의 정숫값이 아니면 다시 입력)
        Scanner scn = new Scanner(System.in);

        int x;
        do {
            System.out.println("정숫값 : ");
            x = scn.nextInt();
        } while (x < 100 || x > 999);
        System.out.println("입력한 정숫값은 " + x);
    }
}
