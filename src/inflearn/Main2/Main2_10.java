package inflearn.Main2;

import java.util.Scanner;

public class Main2_10 { // 인프런 2-10. 봉우리

    static int solution(int n, int[][] arr) {
        int answer = 0;

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(arr[i][j] > arr[i-1][j]) {
                    if(arr[i][j] > arr[i][j-1]) {
                        if(arr[i][j] > arr[i][j+1]) {
                            if(arr[i][j] > arr[i+1][j]) {
                                answer++;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
