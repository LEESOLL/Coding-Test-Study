package inflearn;

import java.util.Scanner;

public class Main1_7 { // 인프런 1-7 회문 문자열
//StringBuilder 의 reverse() 사용하면 되겠다.
    public String solution(String str) {
        str = str.toLowerCase();
        if(str.equals(new StringBuilder(str).reverse().toString())) {
            return "YES";
        } else
            return "NO";
    }

    public static void main(String[] args) {
        Main1_7 m = new Main1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }

}
