package programmers;

public class CountK { //프로그래머스 입문 <K의 개수>
    public int solution(int i, int j, int k) {
        int answer = 0;
        int quotient = 0;
        int remainder = 0;
        for(int x = i; x <= j; x++) {
            quotient = x;
            while(quotient > 0) {
                remainder = quotient % 10;
                if(remainder == k)
                    answer++;
                quotient = quotient / 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CountK countK = new CountK();
        System.out.println(countK.solution(1, 13, 1));
    }
}