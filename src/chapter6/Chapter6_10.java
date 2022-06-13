package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Chapter6_10 {
    public static void main(String[] args) throws IOException {
        // 요소의 형이 int형인 배열을 만들어서 모든 요소에 1~10의 난수를 대입
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        System.out.print("요소 수 : ");
        int[] arr = new int[Integer.parseInt(br.readLine())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + r.nextInt(10);
            System.out.printf("arr[%d] = %d", i, arr[i]);
            System.out.println();
        }
    }
}
