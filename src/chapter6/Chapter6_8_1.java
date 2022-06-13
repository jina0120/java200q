package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter6_8_1 {
    public static void main(String[] args) throws IOException {
        // 배열에서 특정 값을 가지는 요소를 찾아라.
        // 동일 값의 요소가 여러개 있으면 가장 앞에 위치한 요소를 찾는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요소 수 : ");
        int[] arr = new int[Integer.parseInt(br.readLine())];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("찾을 숫자 : ");
        int n = Integer.parseInt(br.readLine());

        int i = 0;
        while (i < arr.length) {
            if (arr[i] == n) {
                break;
            }
            i++;
        }

        if (i == arr.length) {
            System.out.printf("그 값은 없습니다.");
        } else {
            System.out.printf("그 값은 arr[%d]에 있습니다.", i);
        }
    }
}
