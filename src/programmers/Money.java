package programmers;

public class Money { // 프로그래머스 위클리 챌린지 <부족한 금액 계산하기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/82612
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long totalPrice = 0;

        for(int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }

        if ((money - totalPrice) < 0)
            answer = Math.abs(money - totalPrice);

        return answer;
    }

    public static void main(String[] args) {
        int money = 5;
        int n = 2;
        System.out.println(Math.pow(money, n));
    }

}
