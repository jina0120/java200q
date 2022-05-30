package chapter4;

import java.util.Scanner;

public class Chapter4_10 {
    public static void main(String[] args) {
        // 양의 정숫값을 입력 받아서 1부터 n까지의 곱을 구하는 프로그램
        Scanner scn = new Scanner(System.in);
        
        int x;
        do {
            System.out.println("정수 입력 : ");
            x = scn.nextInt();
        } while (x < 1);
        
        int i = 1;
        int result = 1;
        
        while (i <= x) {
            result *= i;
            i++;
        }
        System.out.println("정수의 1에서부터 n까지의 곱은 " + result);
    }
}
