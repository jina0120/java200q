package chapter2;

import java.util.Random;

public class Chapter2_13 {
    public static void main(String[] args) {
        // 실수의 난수를 생성해 출력
        Random r = new Random();

        // 0.0이상 1.0미만의 실숫값 랜덤 생성
        double x = r.nextDouble();
        // 0.0이상 10.0미만의 실숫값 랜덤 생성
        double y = r.nextDouble() * 10;
        // -1.0이상 1.0미만의 실숫값 랜덤 생성
        double z = r.nextDouble() * 2 -  1;

        System.out.println("0.0이상 1.0미만의 실숫값 = " + x);
        System.out.println("0.0이상 10.0미만의 실숫값 = " + y);
        System.out.println("-1.0이상 1.0미만의 실숫값 = " + z);
    }
}
