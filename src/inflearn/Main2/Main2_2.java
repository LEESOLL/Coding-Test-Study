package inflearn.Main2;

import java.util.Scanner;

public class Main2_2 { // 인프런 2-2. 보이는 학생
    // max 에 큰 키 저장
    // max 가 나타난 인덱스 뒤부터는 max 보다 커야지 보임
    static int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
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

        System.out.println(solution(n, arr));
    }
}
