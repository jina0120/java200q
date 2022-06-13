package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Chapter6_12 {
    public static void main(String[] args) throws IOException {
        // 서로 다른 요소가 동일한 값을 지니지 않도록 6_10을 수정.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        System.out.print("요소 수 : ");
        int[] arr = new int[Integer.parseInt(br.readLine())];
        for (int i = 0; i < arr.length; i++) {
            int j;
            do {
                arr[i] = 1 + r.nextInt(10);
                for (j = 0; j < i; j++) {
                    if (arr[j] == arr[i]) {
                        break;
                    }
                }
            } while (j < i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d", i, arr[i]).println();
        }
    }
}
