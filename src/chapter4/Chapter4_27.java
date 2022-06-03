package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_27 {
    public static void main(String[] args) throws IOException {
        // 정숫값을 읽어 합계와 평균을 구하는 프로그램. 단 정숫값의 입력은 합계가 1000을 넘지 않은 범위에서 이뤄질 것.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("몇 개의 합과 평균을 구할까요? : ");
        int n = Integer.parseInt(br.readLine());

        // 합계
        int sum = 0;
        // 초기값
        int i;
        for (i = 1 ; i <= n ; i++) {
            System.out.print("정수입력 : ");
            int x = Integer.parseInt(br.readLine());
            // 합계에 더하기
            sum += x;
            // 합계가 1000이 넘을 때
            if (sum >= 1000) {
                System.out.println("합계가 1,000을 넘었습니다. \n마지막 값은 무시합니다.");
                // 마지막으로 더했던 값 취소
                sum -= x;
                // if문, for문 탈출
                break;
            }
        }
        // 평균 구하기
        int average = sum / (i - 1);
        System.out.printf("합계는 %d, 평균은 %d", sum, average);
    }
}
