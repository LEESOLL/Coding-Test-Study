package inflearn.Main2;

import java.util.Scanner;

public class Main2_9 { // 인프런 2-9. 격자판 최대합

    static int solution(int[][] arr) {
        int answer = 0;
        int hang = 0, yeol = 0, cross1 = 0, cross2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                hang += arr[i][j];
                yeol += arr[j][i];
            }
            answer = Math.max(answer, hang);
            answer = Math.max(answer, yeol);
            hang = 0;
            yeol = 0;
            cross1 += arr[i][i];
            cross2 += arr[i][arr.length - i - 1];
        }
        answer = Math.max(answer, cross1);
        answer = Math.max(answer, cross2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));
    }
}
