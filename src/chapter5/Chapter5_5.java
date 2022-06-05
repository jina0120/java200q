package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Chapter5_5 {
    public static void main(String[] args) throws IOException {
        // 3개의 정숫값을 읽어서 합계와 평균을 구하는 프로그램. 평균을 실수로 표시.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("x값 : ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("y값 : ");
        int y = Integer.parseInt(br.readLine());
        System.out.print("z값 : ");
        int z = Integer.parseInt(br.readLine());

        int sum = x + y + z;
        double average = sum / 3.0;
        System.out.printf("x, y, z의 합은 %d, 평균은 %.3f", sum, average);
    }
}
