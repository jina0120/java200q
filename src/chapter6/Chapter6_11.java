package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Chapter6_11 {
    public static void main(String[] args) throws IOException {
        // 인접하는 요소가 동일한 값을 가지지 않도록 6_10을 수정.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요소 수 : ");
        int[] arr = new int[Integer.parseInt(br.readLine())];
        Random r = new Random();

        arr[0] = 1 + r.nextInt(10);
        for (int i = 1; i < arr.length; i++) {
            do {
                arr[i] = 1 + r.nextInt(10);
            } while (arr[i-1] == arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d", i, arr[i]).println();
        }
    }
}
