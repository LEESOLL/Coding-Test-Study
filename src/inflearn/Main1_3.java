package inflearn;


import java.util.Scanner;

public class Main1_3 { // 인프런 1-3 문장 속 단어

  public static String solution(String str) {
    String answer = "";
    // 공백을 만나면 문장을 잘라서 단어의 길이를 비교
    StringBuffer tmp = new StringBuffer(str + " ");
    int count = 0;
    int max = 0;

    for (int i = 0; i < tmp.length(); i++) {
      if (tmp.charAt(i) != ' ') {
        count++;
      } else {
        if (count > max) {
          max = count;
          answer = tmp.substring(i - count, i);
        }
        count = 0;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    System.out.println(solution(str));
  }
}
