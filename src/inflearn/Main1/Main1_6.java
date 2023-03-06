package inflearn.Main1;

import java.util.Scanner;

public class Main1_6 { // 인프런 1-6 중복문자제거
    static StringBuilder solution(String str) {
        StringBuilder answer = new StringBuilder();

        while(str.length() > 0) {
            answer.append(str.charAt(0));
            str = str.replaceAll(String.valueOf(str.charAt(0)), "");
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
