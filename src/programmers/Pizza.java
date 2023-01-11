package programmers;

public class Pizza { //프로그래머스 입문 피자 나눠먹기(2)
    // https://school.programmers.co.kr/learn/courses/30/lessons/120815
    /*
    피자 한판에 6조각, n명이 나눠먹으려면 6*result 가 n 으로 나눠떨어져야 함
    6 * result % n == 0
     */
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 100; i++) {
            if((6*i) % n == 0)
                return i;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
