package chapter5;

public class Chapter5_9_2 {
    public static void main(String[] args) {
        // 0.0부터 1.0까지 0.001단위로 증가시키면서 해당 값의 제곱을 표시하는 프로그램 (반복을 int형으로 제어)
        System.out.println("    x           x의 제곱");
        for (int x = 0 ; x <= 1000 ; x++) {
            float f = (float) x / 1000;
            System.out.printf("%5.3f       %10.7f", f, f * f).println();
        }
    }
}
