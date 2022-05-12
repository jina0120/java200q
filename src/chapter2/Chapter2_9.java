package chapter2;

import java.util.Scanner;

public class Chapter2_9 {
    public static void main(String[] args) {
        // 삼각형의 넓이를 구해서 표시
        Scanner scn = new Scanner(System.in);

        System.out.println("밑 변 : ");
        double base =  scn.nextDouble();

        System.out.println("높이 : ");
        double height = scn.nextDouble();

        System.out.println("삼각형의 넓이 = " + (base * height)/2);
    }
}
