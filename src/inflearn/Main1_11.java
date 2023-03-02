package inflearn;

import java.util.Scanner;

public class Main1_11 { // 인프런 1-11 문자열 압축

    static String solution(String str) {
        String answer = "";
        int cnt = 1;
        str = str + ' ';
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i+1) == str.charAt(i)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
