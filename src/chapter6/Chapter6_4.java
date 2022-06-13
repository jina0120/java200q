package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Chapter6_4 {
    public static void main(String[] args) throws IOException {
        // int형 배열의 각 요소에 1~10의 난수 대입, 각 요소의 값을 막대그래프(기호 *를 나열)로 표시하는 프로그램.
        // 요소 수는 키보드로 입력한다. 마지막에는 인덱스를 10으로 나눈 나머지 표시
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요소 수 : ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + r.nextInt(10);
        }

        for (int i = 10; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 2 * n; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i % 10 + " ");
        }
    }
}
