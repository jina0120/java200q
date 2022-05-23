package chapter3;

import java.util.Random;

public class Chapter3_20 {
    public static void main(String[] args) {
        // 0, 1, 2 중 하나의 난수를 생성. 0은 가위, 1은 바위, 2는 보를 출력하는 프로그램
        Random r = new Random();

        System.out.println("컴퓨터가 낸 가위, 바위, 보 중 하나는?");
        int x = r.nextInt(3);

        switch (x) {
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }
    }
}
