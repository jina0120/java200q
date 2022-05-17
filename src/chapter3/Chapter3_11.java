package chapter3;

import java.util.Scanner;

public class Chapter3_11 {
    public static void main(String[] args) {
        // 입력한 점수에 따라 수, 우, 미, 양, 가를 판정하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("점수를 입력하세요. : ");
        int score = scn.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수입니다.");
        } else {
            if (score >= 80) {
                System.out.println("수");
            } else if (score >= 70) {
                System.out.println("우");
            } else if (score >= 60) {
                System.out.println("미");
            } else if (score >= 50) {
                System.out.println("양");
            } else {
                System.out.println("가");
            }
        }
    }
}
