package inflearn.Main1;

import java.util.Scanner;

public class Main1_5 { // 인프런 1-5 특정 문자 뒤집기
    public static String solution(String str) {
        // isCharacter 이용해서 문자 판별 후 left 랑 right 랑 바꿔주기
        // left < right 일 때까지만 탐색
        // if left 가 알파벳인 경우 -> if right 도 알파벳이면 둘이 바꿔
        // if left 만 알파벳인 경우 -> right 하나 감소시켜
        // if right 만 알파벳인 경우 -> left 하나 증가시켜
        int left = 0;
        int right = str.length() - 1;
        char[] charArr = str.toCharArray();
        while (left < right) {
            if(Character.isAlphabetic(charArr[left])) {
              if(Character.isAlphabetic(charArr[right])) {
                char tmp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = tmp;
                left++;
                right--;
              }
              else {
                right--;
              }
            } else {
              left++;
            }
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
