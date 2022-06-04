package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter5_3 {
    public static void main(String[] args) throws IOException {
        // float형 변수와 double형 변수에 실숫값을 읽어서 표시하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("변수 x는 float형, 변수 y는 double형");
        System.out.print("x : ");
        float x = Float.parseFloat(br.readLine());
        System.out.print("y : ");
        double y = Double.parseDouble(br.readLine());

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
