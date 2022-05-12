package chapter2;

import java.util.Scanner;

public class Chapter2_14 {
    public static void main(String[] args) {
        // 키보드로 입력한 성과 이름으로 인사 출력
        Scanner s = new Scanner(System.in);

        System.out.println("성 : ");
        String lastName = s.next();
        System.out.println("이름 : ");
        String firstName = s.next();

        System.out.println("안녕하세요." + lastName + firstName + "씨.");
    }
}
