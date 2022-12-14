package programmers;

public class Decode { //프로그래머스 코딩테스트 입문 암호 해독
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for(int i = code - 1; i < cipher.length(); i += code){
            answer.append(cipher.charAt(i));
        }
        //String answer = "";

        //return answer;
        return answer.toString();
    }

    public static void main(String[] args) {
        Decode decode = new Decode();
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(decode.solution(cipher,code));
    }
}
