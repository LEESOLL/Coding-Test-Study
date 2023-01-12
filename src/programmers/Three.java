package programmers;

public class Three { // 프로그래머스 월간코드 챌린지 시즌1 <3진법 뒤집기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/68935
    public static int solution(int n) {
        int answer = 0;
        StringBuilder tmp = new StringBuilder();

        while(n > 0) {
            tmp.append((char)(n%3 + 48));
            n = n / 3;
        } //3진법 수 구함

        for(int i = 0; i < tmp.length() - 1; i++) {
            answer += Math.pow(3, tmp.length()- i - 1) * Character.getNumericValue(tmp.charAt(i));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
