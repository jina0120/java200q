package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter6_9 {
    public static void main(String[] args) throws IOException {
        // double형인 배열의 모든 요소의 합과 평균을 구하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요소 수 : ");
        double[] arr = new double[Integer.parseInt(br.readLine())];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = Double.parseDouble(br.readLine());
            sum += arr[i];
        }
        System.out.printf("모든 요소의 합은 %.1f", sum).println();
        System.out.printf("모든 요소의 평균은 %.2f", sum/arr.length).println();
    }
}
