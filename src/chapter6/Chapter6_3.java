package chapter6;

public class Chapter6_3 {
    public static void main(String[] args) {
        // 요소 개수가 5개인 double형 배열 생성, 앞에서부터 1.1, 2.2, 3.3, 4.4, 5.5 대입 출력 프로그램
        double[] arr = new double[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.1 * (i + 1);
            System.out.printf("arr[%d] = %f", i, arr[i]).println();
        }
    }
}
