package programmers;

public class FindNum { //프로그래머스 입문 <숫자 찾기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120904?language=java
    public static int solution(int num, int k) {
        int answer = -1;
        String tmp = String.valueOf(num);
        for(int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i) == (char)(k+48))
                return i+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(29183,1));
        System.out.println((char)49);
    }
}
