package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_24 {
    public static void main(String[] args) throws IOException {
        // n단의 숫자 피라미드를 표시하는 프로그램. i번째 행에는 i % 10 출력
        // 버퍼드 리더 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n단 입력 받기
        System.out.print("피라미드의 단수를 입력해주세요. : ");
        int n = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= n ; i++) {
            for (int j = n-i ; j > 0 ; j--) {
                System.out.print(" ");
            }

            for (int k = 1 ; k <= (2*i-1) ; k++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }
}
