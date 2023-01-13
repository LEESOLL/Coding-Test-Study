package programmers;

public class PrimeNum { // 프로그래머스 연습문제 <소수 찾기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/12921
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i = 2; i < n + 1; i++) {
            for(int j = i; j < n + 1; j = j + i) {
                arr[j]++;
            }
        }
        for(int i = 2; i < arr.length; i++) {
            if (arr[i] == 1){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
