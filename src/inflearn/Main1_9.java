package inflearn;

import java.util.Scanner;

public class Main1_9 { // 인프런 1-9 숫자만 추출
    // StringBuilder 에 숫자를 추출해서 넣어준 뒤, 숫자로 형변환 시켜주기 -> 제일 앞의 0은 무시됨
    static int solution(String str) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                s.append(str.charAt(i));
            }
        }
        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
