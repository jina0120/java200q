package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_26 {
    public static void main(String[] args) throws IOException {
        // 정숫값을 연속해서 입력받아 합계와 평균을 구하는 프로그램. 0 입력시 종료.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("몇 개의 합과 평균을 구할까 ? : ");
        int n = Integer.parseInt(br.readLine());

        // 합계
        int sum = 0;
        // 초기값
        int i;
        for (i = 1 ; i <= n ; i++) {
            System.out.print("정수입력 (종료하려면 0 입력) : ");
            int x = Integer.parseInt(br.readLine());
            if (x == 0) break;
            sum += x;
        }
        // 평균
        int average = sum / (i-1);
        System.out.printf("합계는 %d, 평균은 %d", sum, average);
    }
}
