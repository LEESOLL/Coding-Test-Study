package programmers;

import java.util.ArrayList;

public class GCDLCM { // 프로그래머스 연습문제 <최대공약수와 최소공배수>
    // https://school.programmers.co.kr/learn/courses/30/lessons/12940
    // 두 수를 곱한 값 = 최소공배수 * 최대공약수
    // 최소공배수 = 두 수를 곱한 값 / 최대공약수
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int small;
        if(n > m) {
            small = m;

        } else {
            small = n;
        }
        for(int i = 1; i <= small; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        answer[1] = n * m / answer[0];

        return answer;
    }
}
