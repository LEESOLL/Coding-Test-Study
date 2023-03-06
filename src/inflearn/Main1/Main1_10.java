package inflearn.Main1;

import java.util.Scanner;

public class Main1_10 { // 인프런 1-10 가장 짧은 문자거리
    static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int cnt = 1000;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t) {
                answer[i] = ++cnt;
            } else if(s.charAt(i) == t) {
                answer[i] = 0;
                cnt = 0;
            }
        }
        cnt = 1000;
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) != t) {
                ++cnt;
                if(answer[i] > cnt) {
                    answer[i] = cnt;
                }
            } else if(s.charAt(i) == t) {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        for(int x : solution(s,t)) {
            System.out.print(x + " ");
        }
    }
}
