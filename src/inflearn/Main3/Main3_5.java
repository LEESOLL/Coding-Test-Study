package inflearn.Main3;

import java.util.Scanner;

public class Main3_5 { // 인프런 3-5. 연속된 자연수의 합
    static int solution (int n) {
        int answer = 0;
        int lt = 1, rt;
        int sum = 0;

        for(rt = 1; rt <= n/2 + 1; rt++) {
            sum += rt;
            if(sum == n) answer++;
            while(sum >= n) {
                sum -= lt++;
                if(sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
