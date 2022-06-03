package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_25 {
    public static void main(String[] args) throws IOException {
        // 양의 정숫값을 읽어 소수인지 판정하는 프로그램
        // 소수는 2이상 n미만인 수 중 어떤 수로도 나누어지지 않는 정숫값 n, 즉 자기자신과 1로 나눠지는 수

        // 버퍼드 리더 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정수 입력받기
        int x;
        // 정수가 2미만이라면 다시 입력받기
        do {
            System.out.println("소수 판정 프로그램 - 정수를 입력하세요. : ");
            x = Integer.parseInt(br.readLine());
        } while (x < 2);

        // 초기값
        int i;
        for (i = 2 ; i < x ; i++) {
            if (x % i == 0) {
                break;
            }
        }

        if (i == x) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }
}
