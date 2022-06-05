package chapter6;

public class Chapter6_1 {
    public static void main(String[] args) {
        // 자료형은 double, 요소 수가 5인 배열 생성, 배열의 모든 요소를 표시하는 프로그램
        double[] dblArr = new double[5];

        for (int i = 0 ; i < dblArr.length ; i++) {
            System.out.printf("dblArr[%d] = %.1f", i, dblArr[i]).println();
        }
    }
}
