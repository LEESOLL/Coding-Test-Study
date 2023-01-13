package programmers;

public class PrimeNum { // 프로그래머스 연습문제 <소수 찾기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/12921
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i = 2; i * i < n + 1; i++) {
            if(arr[i] == 0) {
                answer++;
                arr[i] = 1;
            }
            for(int j = i * i; j < n + 1; j = j + i) { //에라토스테네스 체의 특징과 같은 맥락으로, i*i 미만은 이미 처리되었으므로 j의 시작값을 i*i 로 최적화 할 수 있다.
                arr[j] = 1;
            }
        }
        for(int i = 2; i < arr.length; i++) {
            if (arr[i] == 0){
                answer++;
            }
        }
        return answer;
    }
//        public static int solution(int n) {
//        int answer = 0;
//        int[] arr = new int[n+1];
//        for(int i = 2; i < n + 1; i++) {
//            if(arr[i] == 0) {
//                answer++;
//                arr[i] = 1;
//            }
//            for(int j = i ; j < n + 1; j = j + i) {
//                arr[j] = 1;
//            }
//        }
//        for(int i = 2; i < arr.length; i++) {
//            if (arr[i] == 0){
//                answer++;
//            }
//        }
//        return answer;
//    }


    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
