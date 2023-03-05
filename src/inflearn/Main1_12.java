package inflearn;

import java.util.Scanner;

public class Main1_12 { // 인프런 1-12 암호
    // 비밀편지 대문자로 구성
    // 암호로 구성, 알파벳 한문자마다 #,*이 일곱개
    // #은1, *은 0
    // 2진수를 10진수로 바꾼 후 ASCII 코드 적용해서 알파벳 구하기
    // -> Integer.parseInt? char로 ascii 확인
    // 7씩 string 잘라.
    static String solution(int n, String str) {
        StringBuilder answer = new StringBuilder();

        while(str.length() > 0) {
            String tmp = str.substring(0,7);
            int temp = Integer.parseInt(tmp.replace('#','1').replace('*','0'),2);
            answer.append((char)temp);
            str = str.substring(7);
        }

        return answer.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }
}
