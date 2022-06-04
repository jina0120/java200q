package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_28 {
    public static void main(String[] args) throws IOException {
        // 정숫값을 연달아 읽어 음수가 아닌 값의 합계와 평균을 구하자.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        do {
            System.out.print("몇 개를 더할까? : ");
            n = Integer.parseInt(br.readLine());
        } while (n < 0);

        // 합계
        int sum = 0;
        // 음수를 제외한 총 입력된 정수의 개수
        int count = 0;

        for(int i = 1 ; i <= n ; i++) {
            System.out.print("정수 : ");
            int x = Integer.parseInt(br.readLine());
            // 음수인지 체크
            if (x <= 0) {
                System.out.println("음수는 더하지 않습니다.");
            } else {
                // 합계
                sum += x;
                // 정수 개수 카운트
                count++;
            }
        }
        // 평균 구하기
        int average = sum / count;
        // 결과 출력
        System.out.printf("합계는 %d, 평균은 %d", sum, average);
    }
}
