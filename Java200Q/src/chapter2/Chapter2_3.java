package chapter2;

public class Chapter2_3 {
    public static void main(String[] args) {
        // 2_2 와 동일한 프로그램에 실숫값을 대입하여 결과 확인
        int x;
        int y;

        // int 변수에 실수를 넣어 에러 발생
        x = 63.4;
        y = 18.3;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("합 = " + (x + y));
        System.out.println("평균 = " + ((x + y) / 2));
    }
}
