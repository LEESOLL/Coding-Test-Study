package inflearn.Main3;

import java.util.Scanner;

public class Main3_3 { // 인프런 3-3. 최대 매출
    // 연속된 k 일 동안의 최대 매출액
    static int solution(int n, int k, int[] arr) {
        int answer = 0;

        int tmp = 0;

        for(int i = 0; i < k; i++) {
            tmp += arr[i];
        } // sliding window 초기화 (0부터 k일까지의 매출액을 더해놓음)

        answer = tmp;

        for(int i = 1; i < n - k; i++) {
            tmp = tmp - arr[i-1] + arr[i+k-1]; // 한칸씩 밀며 k일 매출액을 더함
            if(tmp > answer) {
                answer = tmp;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}
