package inflearn.Main1;

import java.util.Scanner;

public class Main1_4 { // 인프런 1-4 단어 뒤집기

  public static String[] solution(int n, String[] str) {
    String[] answer = new String[n];

//    for(int i = 0; i < n; i++) {
//      answer[i] = new StringBuilder(str[i]).reverse().toString();
//    }
    for (int i = 0; i < n; i++) {
      char[] strToCharArr = str[i].toCharArray();
      for (int j = 0; j < strToCharArr.length / 2; j++) {
        char tmp2 = strToCharArr[j];
        strToCharArr[j] = strToCharArr[strToCharArr.length - j - 1];
        strToCharArr[strToCharArr.length - j - 1] = tmp2;
      }
      answer[i] = String.valueOf(strToCharArr);
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
