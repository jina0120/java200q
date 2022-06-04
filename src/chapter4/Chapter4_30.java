package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Chapter4_30 {
    public static void main(String[] args) throws IOException {
        // 4_3의 숫자 맞추기 게임에서 숫자의 범위를 0~99로 변경, 플레이어가 입력할 수 있는 횟수를 제한하도록 프로그램 수정,
        // 제한횟수 내에 맞추지 못하다면 정답 출력, 게임 종료.
        Random r = new Random();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 기회
        final int CHANCE = 6;
        // 남은 기회
        int remainingChance = CHANCE;
        // 랜덤 숫자 생성
        int answer = r.nextInt(99);
        // 사용자가 입력한 값
        int x;

        System.out.println("숫자 맞추기 게임 - 0부터 99사이의 숫자를 맞추자!");
        do {
            // 출력 후 남은 기회 감소
            System.out.printf("남은 횟수는 %d회, 몇일까? : ", remainingChance--);
            x = Integer.parseInt(br.readLine());

            // 남은 기회가 있을 때 답과 사용자가 입력한 값 비교하여 힌트 출력
            if (x < answer && remainingChance != 0) {
                System.out.println("더 큰 숫자입니다.");
            } else if (x > answer && remainingChance != 0) {
                System.out.println("더 작은 숫자입니다.");
            }
        } while (remainingChance > 0 && answer != x); // 남은 기회가 있고 틀렸을 경우에 반복

        if (x == answer) {
            System.out.printf("%d회만에 맞췄습니다!", CHANCE - remainingChance);
        } else {
            System.out.printf("정답은 %d 입니다.", answer);
        }
    }
}
