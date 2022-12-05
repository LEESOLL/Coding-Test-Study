package programmers;

public class Location { // 프로그래머스 코딩테스트 입문 <캐릭터의 좌표>
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int minLeft = -(board[0]/2);
        int maxRight = board[0]/2;
        int minDown = -(board[1]/2);
        int maxUp = board[1]/2;

        for(String x : keyinput) {
            switch(x) {
                case "up":
                    answer[1]++;
                    if(answer[1] > maxUp) {
                        answer[1] = maxUp;
                    }
                    break;
                case "down":
                    answer[1]--;
                    if(answer[1] < minDown) {
                        answer[1] = minDown;
                    }
                    break;
                case "left":
                    answer[0]--;
                    if(answer[0] < minLeft) {
                        answer[0] = minLeft;
                    }
                    break;
                case "right":
                    answer[0]++;
                    if(answer[0] > maxRight) {
                        answer[0] = maxRight;
                    }
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Location location = new Location();
        String[] keyinput = {"left", "left", "left", "right"};
        int[] board = {3, 3};

        System.out.println(location.solution(keyinput,board)[0]);
        System.out.println(location.solution(keyinput,board)[1]);
    }
}
