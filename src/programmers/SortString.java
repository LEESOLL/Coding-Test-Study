package programmers;
import java.util.*;

public class SortString { // 프로그래머스 입문 <문자열 정렬하기(2)>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120911
    public static String solution(String my_string) {
        //우선 소문자로 바꾸고, sort 사용 ?
        String answer = "";
        char[] ch = my_string.toLowerCase().toCharArray();

        for(int i = 0; i < ch.length - 1; i++) {
            for(int j = i + 1; j < ch.length; j++) {
                if (ch[j] < ch[i]) {
                    char tmp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = tmp;
                }
            }
        }
        answer = String.valueOf(ch);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
    }
}
