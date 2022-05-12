package chapter2;

import java.util.Scanner;

public class Chapter2_7 {
    public static void main(String[] args) {
        // 키보드에서 입력받은 정숫값. 마지막 자릿수를 제외한 값, 마지막 자릿수 출력
        Scanner scn = new Scanner(System.in);
        
        System.out.println("정숫값 : ");
        int x = scn.nextInt();
        System.out.println("마지막 자릿수를 제외한 값 = " + (x / 10));
        System.out.println("마지막 자릿수 = " + (x % 10));
    }
}
