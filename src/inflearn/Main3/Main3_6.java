package inflearn.Main3;

import java.util.Scanner;

public class Main3_6 { // 인프런 3-6. 최대 길이 연속부분수열

    // 길이가 n 인 수열, 최대 k 번을 0을 1로 바꿀 수 잇음.
    // 1로만 구성된 최대 길이의 연속부분수열 찾기(최대 길이 출력)

    static int solution(int n, int k, int[] arr) {
        int answer = Integer.MIN_VALUE;
        int lt = 0;
        int zeroCnt = 0;

        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) zeroCnt++;
            while(zeroCnt > k) {
                if(arr[lt] == 0) {
                    zeroCnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1); //rt-lt+1 은 선분의 길이
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}
