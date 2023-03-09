package inflearn.Main2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2_6 { // 인프런 2-6. 뒤집은 소수
    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
            for(int j = 2; j * j <= tmp; j++) {
                if(tmp % j == 0) {
                    cnt++;
                }
            } if(cnt == 0 && tmp != 1) {
                answer.add(tmp);
            }
            cnt = 0;
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
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
