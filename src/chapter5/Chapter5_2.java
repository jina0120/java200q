package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter5_2 {
    public static void main(String[] args) throws IOException {
        // 10진수를 읽어서 8진수와 16진수로 표시하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수 : ");
        int x = Integer.parseInt(br.readLine());
        System.out.printf("8진수는 %o, 16진수는 %x", x, x);
    }
}
