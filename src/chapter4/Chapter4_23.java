package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_23 {
    public static void main(String[] args) throws IOException {
        // n단 피라미드 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("피라미드의 단수는? : ");
        int x = Integer.parseInt(br.readLine());

        // 단수
        for (int i = 1 ; i <= x ; i++) {
            // 공백 입력
            for (int j = x-i ; j >= 0 ; j--) {
                System.out.print(" ");
            }
            // * 입력
            for (int k = 1 ; k <= (2*i-1) ; k++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}
