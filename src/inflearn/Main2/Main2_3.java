package inflearn.Main2;

import java.util.Scanner;

public class Main2_3 { // 인프런 2-3. 가위 바위 보
    // 가위:1, 바위:2, 보:3
    // A, B, D
    // 1 vs 2일 때 2가 이김
    // 1 vs 3일 때 1이 이김
    // 2 vs 3일 때 3이 이김
    static String[] solution(int n, int[][] arr) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            if(arr[0][i] == 1) {
                if(arr[1][i] == 2) {
                    answer[i] = "B";
                }
                else if(arr[1][i] == 1) {
                    answer[i] = "D";
                } else answer[i] = "A";
            } else if(arr[0][i] == 2) {
                if(arr[1][i] == 2) {
                    answer[i] = "D";
                }
                else if(arr[1][i] == 1) {
                    answer[i] = "A";
                } else answer[i] = "B";
            } else if(arr[0][i] == 3) {
                if(arr[1][i] == 2) {
                    answer[i] = "A";
                }
                else if(arr[1][i] == 1) {
                    answer[i] = "B";
                } else answer[i] = "D";
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(String x : solution(n,arr))
            System.out.println(x);
    }
}
