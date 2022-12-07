package programmers;
import java.util.LinkedList;
import java.util.Queue;

public class OXQuiz { //프로그래머스 코딩테스트 입문 <OX퀴즈>
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] tmp;
        int ans = 0;

        for(int i = 0; i < quiz.length; i++) {
            tmp = quiz[i].split(" ");
            if(tmp[1].equals("+")) {
                ans = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
                if(ans == Integer.parseInt(tmp[4])) {
                    answer[i] = "O";
                }
                else answer[i] = "X";
            }
            else {
                ans = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
                if(ans == Integer.parseInt(tmp[4])) {
                    answer[i] = "O";
                }
                else answer[i] = "X";
            }
        }


        return answer;
    }

    public static void main(String[] args) {
       OXQuiz oxQuiz = new OXQuiz();
       String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(oxQuiz.solution(quiz)[0]);
        System.out.println(oxQuiz.solution(quiz)[1]);

    }
}
