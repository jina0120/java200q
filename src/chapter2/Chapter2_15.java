package chapter2;

import java.util.Scanner;

public class Chapter2_15 {
    public static void main(String[] args) {
        // 입력한 주소 출력
        Scanner s = new Scanner(System.in);

        System.out.println("주소 : ");
        String address = s.nextLine();

        System.out.println("주소는 " + address + "입니다.");
    }
}
