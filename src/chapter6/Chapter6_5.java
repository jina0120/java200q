package chapter6;

public class Chapter6_5 {
    public static void main(String[] args) {
        // 배열의 요소 수가 5인 int형 배열을 5,4,3,2,1 순서대로 초기화해서 표시
        int[] arr = {5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d", i, arr[i]).println();
        }
    }
}
