package inflearn;

import java.util.Scanner;

public class Main1_4 { // 인프런 1-4 단어 뒤집기

  public static String[] solution(int n, String[] str) {
    String[] answer = new String[n];

    for(int i = 0; i < n; i++) {
      answer[i] = new StringBuilder(str[i]).reverse().toString();
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] str = new String[n];

    for (int i = 0; i < n; i++) {
      str[i] = sc.next();
    }

    for (String x : solution(n, str)) {
      System.out.println(x);
    }
  }
}
