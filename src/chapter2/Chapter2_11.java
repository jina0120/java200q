package chapter2;

import java.util.Random;

public class Chapter2_11 {
    public static void main(String[] args) {
        // 난수 생성하기
        Random rd = new Random();

        // 한자리 양의 정수값
        // 0 ~ 9미만인 난수 + 1 => 1 ~ 9
        int x = 1 + rd.nextInt(9);
        // 한자리 음의 정수값
        // -9미만 ~ 0인 난수 -1 => -9 ~ -1
        int y = -1 - rd.nextInt(9);
        // 두자리 양의 정수값
        // 10 ~ 99까지. 0 ~ 90 + 10
        int z = 10 + rd.nextInt(90);

        System.out.println("한자리 양의 정수 : " + x);
        System.out.println("한자리 음의 정수 : " + y);
        System.out.println("두자리 양의 정수 : " + z);
    }
}
