package chapter6;

public class Chapter6_2 {
    public static void main(String[] args) {
        // 요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1을 대입하는 프로그램
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
            System.out.printf("arr[%d] = %d", i, arr[i]).println();
        }
    }
}
