package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter6_14 {
    public static void main(String[] args) throws IOException {
        // 배열 a의 모든 요소를 역순으로 복사해서 표시
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요소 수 : ");
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("a의 모든 요소들을 역순으로 복사했습니다.");
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
            System.out.printf("b[%d] = %d", i, b[i]).println();
        }
    }
}
