package chapter5;

public class Chapter5_7 {
    public static void main(String[] args) {
        // int형 변환에 실숫값을 대입해서 표시하는 프로그램
        int x;
        
        x = (int) 10.345;
//        x = 10.345; // 오류로 주석 처리

        System.out.println("x = " + x);
    }
}
