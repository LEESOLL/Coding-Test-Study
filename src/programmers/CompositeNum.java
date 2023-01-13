package programmers;

public class CompositeNum { // 프로그래머스 입문 <합성수 찾기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120846
    public static int solution(int n) {
        int answer = 0;
        int count;
        for(int i = 4; i <= n+159; i++) {
            count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                    if(count > 2) {
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
