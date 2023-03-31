package inflearn.Main2;

import java.util.*;

public class Main2_8 { // 인프런 2-8. 등수구하기
    static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt + 1;
            cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
