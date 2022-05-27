package chapter4;

import java.util.Scanner;

public class Chapter4_7 {
    public static void main(String[] args) {
        // 입력한 값의 개수만큼 *를 표시하는 프로그램,
        // 마지막에는 줄바꿈문자 출력, 읽은 값이 1미만이면 줄바꿈문자표시 X
        Scanner scn = new Scanner(System.in);

        System.out.println("몇개의 *을 표시할까? : ");
        int x = scn.nextInt();

        while (x > 0) {
            System.out.print("*");
            x--;
        }
    }
}
