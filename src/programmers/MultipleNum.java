package programmers;

public class MultipleNum { // 프로그래머스 입문 <최댓값 만들기(2)>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120862
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
