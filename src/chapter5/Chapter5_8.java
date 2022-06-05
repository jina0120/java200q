package chapter5;

public class Chapter5_8 {
    public static void main(String[] args) {
        // float형의 변수를 0.0부터 1.0까지 0.001씩 증가시키며 표시,
        // 그 옆에 int형 변수를 0부터 1000까지 1씩 증가시켜가며 1000으로 나눈 값을 표시하는 프로그램
        System.out.println("  float            int");

        float f = 0.0F;
        for (int i = 0 ; i <= 1000 ; i++, f += 0.001F) {
            System.out.printf("%9.7f       %9.7f", f, (float) i / 1000).println();
        }
    }
}
