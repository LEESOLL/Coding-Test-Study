package inflearn.Main2;

import java.util.Scanner;

public class Main2_11 { // 인프런 2-10. 임시반장 정하기
    // 한번이라도 같은반이었던 사람이 가장 많은 학생을 임시반장을 정해
    // 서로 중복학생수가 많은 사람이 임시반장
    // 중복학생수가 같은 경우 그 중 가장 작은 번호만 출력

    static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = 0;
        int cnt;

        for(int i = 0; i < n; i++) {
            cnt = 0;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));

    }
}
