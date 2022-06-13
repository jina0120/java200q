package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Chapter6_13 {
    public static void main(String[] args) throws IOException {
        // 배열의 나열 순서를 섞는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            int r1 = r.nextInt(n);
            int r2 = r.nextInt(n);
            int t = arr[r1];
            arr[r1] = arr[r2];
            arr[r2] = t;
        }
        System.out.println("요소를 섞었습니다.");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d", i, arr[i]).println();
        }
    }
}
