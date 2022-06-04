package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_29 {
    public static void main(String[] args) throws IOException {
        // 5개의 정수로 구성된 그룹의 전체 합계(그룹 별이 아닌 전체 그룹의 합)를 구하는 프로그램
        // 10개의 그룹이 있다. 9999를 입력하면 전체 입력을 종료, 8888을 입력하면 현재 읽고 있는 그룹의 입력을 종료.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 합계
        int sum = 0;

        // 10개의 그룹 for문의 레이블 지정
        Groups:
        for (int i = 1; i <= 10; i++) {
            // 몇 번째 그룹인지 출력
            System.out.printf("%d그룹", i).println();
            for (int j = 1; j <= 5; j++) {
                System.out.print("정수 : ");
                int x = Integer.parseInt(br.readLine());
                if (x == 88888) {
                    continue Groups;
                } else if (x == 99999) {
                    break Groups;
                }
                sum += x;
            }
        }
        System.out.println("합계는 " + sum);
    }
}
