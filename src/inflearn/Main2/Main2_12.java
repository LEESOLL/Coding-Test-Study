package inflearn.Main2;

import java.util.Scanner;

public class Main2_12 { // 인프런 2-12. 멘토링
    // M번의 수학테스트 등수를 가지고 멘토와 멘티를 정함
    // A 학생은 M번의 수학테스트에서 모두 B보다 등수가 앞서야 함(A가 멘토, B가 멘티일 때)
    // 짝을 만들 수 있는 경우가 몇가지인가

    static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        int cnt = 0;
        int pi = 0;
        int pj = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { // 멘토, 멘티가 될 수 있는 경우의 수(n은 학생번호), 번호 짝을 만들어줌
                for (int k = 0; k < m; k++) {
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, m, arr));
    }
}
