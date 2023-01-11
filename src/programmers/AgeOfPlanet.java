package programmers;

public class AgeOfPlanet { //프로그래머스 입문 <외계행성의 나이>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120834
    /*
    a : 0 => 아스키 코드로 접근, 97더하면 기존 아스키 코드 나옴
    */
    public StringBuilder solution(int age) {
        StringBuilder answer = new StringBuilder();
        while(age > 0) {
            int remain = age % 10;
            answer.append((char)(remain + 97));
            age = age / 10;
        }

        return answer.reverse();
    }

    public static void main(String[] args) {

    }
}
