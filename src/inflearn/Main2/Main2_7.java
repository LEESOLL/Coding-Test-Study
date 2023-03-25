package inflearn.Main2;

import java.util.Scanner;

public class Main2_7 { //인프런 2-7. 점수계산

    static int solution(int[] arr) {
        int answer = arr[0];
        int cnt = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }
}
