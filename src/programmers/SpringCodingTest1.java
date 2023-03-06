package programmers;

public class SpringCodingTest1 {
    // 당첨자수보다 구매한 사람 수가 적거나 같으면 모두 당첨
    // 당첨자 수보다 구매한 사람 수 많으면 무작위 당첨
    // 배열순서 : 당첨자 수, 구매한 사람 수, 당첨금액
    // 당첨확률 끼리 비교 후 우선순위 : 당첨확률 높은거
    // 당첨 확률이 같으면 당첨금액 높은거 반환
    // 당첨확률 : ((double)lotteries[i][0] / lotteries[i][1]) * 100
    // 당첨확률 배열 설정?
    // 당첨자 수랑 구매한 사람 수-1이 같으면 바로 그 복권 리턴해주기
    public static int solution(int[][] lotteries) {
        int answer = 0;
        double chanceMax = 0.0;
        int moneyMax = 0;
        int idx = -1;

        for (int i = 0; i < lotteries.length; i++) {
            double chance = ((double) lotteries[i][0] / (lotteries[i][1] + 1)) * 100;
            if(chance > chanceMax) { // 당첨확률 높은 경우
                chanceMax = chance;
                idx = i;
                answer = idx + 1;
            } else if(chance == chanceMax) { //당첨확률이 같은 경우
                if(lotteries[idx][2] > lotteries[i][2]) {
                    answer = idx + 1;
                } else answer = i + 1;
            }
        }

        return answer;
    }

    //[[100, 100, 500], [1000, 1000, 100]]
    public static void main(String[] args) {
//        int[][] lotteries = {{100, 100, 500}, {1000, 1000, 100}};
//        System.out.println(solution(lotteries));

    }

}
