package inflearn;

import java.util.Scanner;

public class Main1_8 { // 인프런 1-8 유효한 팰린드롬
    // String 의 replace 메서드 사용
    public static String solution(String str) {
        str = str.toUpperCase();
        String tmp = new StringBuilder(str.replaceAll("[^A-Z]", "")).toString();
        String tmpReverse = new StringBuilder(tmp).reverse().toString();
        if (tmp.equals(tmpReverse))
            return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
