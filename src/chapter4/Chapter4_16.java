package chapter4;

import java.util.Scanner;

public class Chapter4_16 {
    public static void main(String[] args) {
        // 신장별 표준 체중 대응표 표시 프로그램. (시작값(신장)/종료값(신장)/증가값(신장단위)은 정숫값으로 입력받는다.)
        // 표준 체중 = (신장 - 100) * 0.9
        Scanner scn = new Scanner(System.in);

        System.out.println("몇 cm 부터 : ");
        int heightMin = scn.nextInt();
        System.out.println("몇 cm 까지 : ");
        int heightMax = scn.nextInt();
        System.out.println("몇 cm 단위 : ");
        int unit = scn.nextInt();

        System.out.println("----- 신장 표준 체중 -----");
        for ( ; heightMin <= heightMax ; heightMin += unit) {
            System.out.printf("%d %.1f", heightMin, (heightMin - 100)*0.9).println();
        }
    }
}
