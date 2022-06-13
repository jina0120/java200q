package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter6_7 {
    public static void main(String[] args) throws IOException {
        // 점수를 입력 받아 합계, 평균, 최고점, 최저점을 구하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("사람 수 : ");
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];

        System.out.println("점수를 입력하세요.");
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d번의 점수 : ", i + 1);
            score[i] = Integer.parseInt(br.readLine());
            sum += score[i];
        }

        int max = score[0];
        int min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
            if (min > score[i]) {
                min = score[i];
            }
        }

        System.out.println("합계는 " + sum);
        System.out.println("평균은 " + (double) sum/n);
        System.out.println("최고점은 " + max);
        System.out.println("최저점은 " + min);
    }
}
