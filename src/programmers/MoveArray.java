package programmers;

public class MoveArray { //프로그래머스 입문 <배열 회전시키기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120844
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];
            for(int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
        }
        else {
            answer[answer.length-1] = numbers[0];
            for(int i = 0; i < answer.length-1; i++) {
                answer[i] = numbers[i + 1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        for(int x : solution(numbers,"left"))
            System.out.println(x);
    }
}
