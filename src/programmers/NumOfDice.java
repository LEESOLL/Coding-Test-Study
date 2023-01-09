package programmers;

public class NumOfDice { //프로그래머스 입문 <주사위의 개수>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120845

    public static int solution(int[] box, int n) {
        int answer = 0;

        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);

        return answer;
    }

    public static void main(String[] args) {
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(solution(box, n));
    }
}
