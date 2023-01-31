package programmers;
import java.util.ArrayList;

public class LengthOfLine { //프로그래머스 코딩테스트 입문 <겹치는 선분의 길이>
    public int solution(int[][] lines) { //{{0, 5}, {3, 9}, {1, 10}}
        ArrayList<Integer> arr = new ArrayList<>();
        int answer = 0;
        int min = 0;

        for(int i = 0; i < lines.length; i++) {
            for(int j = 0; j < lines[i].length; j++) {
                if(lines[i][j] < min) {
                    min = lines[i][j];
                }
            }
        }
        for(int i = 0; i < lines.length; i++) {
            for(int j = 0; j < lines[i].length; j++) {
                lines[i][j] += Math.abs(min);
            }
        } //모든 선분의 좌표가 0이상의 값을 갖도록 옮겨줌 (인덱스 연산 이용하기 위함)

        for(int i = 0; i < lines.length; i++) {
            for(int j = lines[i][0]; j <= lines[i][1]; j++) {
                arr.add(j, 1);
            }
        }

        for(int i = 0; i < lines.length; i++) {
            for(int j = lines[i][0]; j <= lines[i][1]; j++) {
                arr.add(j, arr.get(j) + 1);
            }
        }

        for(int x : arr) {
            if(x > 1)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        LengthOfLine lengthOfLine = new LengthOfLine();
        int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
        System.out.println(lengthOfLine.solution(lines));
    }
}
