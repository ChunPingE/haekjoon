package programmers.d20230814;

public class 주사위게임1 {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }
        return answer;
    }
}
