package inflearn.Main3;

import java.util.Scanner;

public class Main3_4 { // 인프런 3-4. 연속 부분수열

    static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int tmp_sum = 0;

        for (int i = 0; i < n; i++) {
            tmp_sum += arr[i];
            if (tmp_sum > m) {
                tmp_sum -= arr[lt++];
            } else if (tmp_sum < m) {
                tmp_sum += arr[i];
            }

            if (tmp_sum == m) {
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
