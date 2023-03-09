package inflearn.Main2;

import java.util.Scanner;

public class Main2_5 { // 인프런 2-5. 소수(에라토스테네스의 체)
    static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i * i <= n; i++) {
            if(arr[i] == 0) {
                answer++;
                arr[i] = 1;
            }
            for(int j = i * i; j <= n; j = j + i) {
                arr[j] = 1;
            }
        }

        for(int i = 2; i <= n; i++) {
            if(arr[i] == 0)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
