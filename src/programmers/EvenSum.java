package programmers;

public class EvenSum { //프로그래머스 코딩테스트 입문 <짝수의 합>
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        EvenSum ev = new EvenSum();
        int n = 4;
        System.out.println(ev.solution(n));
    }
}
