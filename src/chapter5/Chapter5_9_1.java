package chapter5;

public class Chapter5_9_1 {
    public static void main(String[] args) {
        // 0.0부터 1.0까지 0.001단위로 증가시키면서 해당 값의 제곱을 표시하는 프로그램 (반복을 float형으로 제어)
        System.out.println("    x           x의 제곱");
        for (float x = 0.0F ; x <= 1.0F ; x += 0.001F) {
            System.out.printf("%5.3f       %10.7f", x, x * x).println();
        }
    }
}
