package programmers;

public class EnglishToNum {
    public long solution(String numbers) {
        long answer = 0;
        String tmp = "";
        while(numbers.length()>0) {
            switch(numbers.charAt(0)) {
                case 'o':
                    tmp += "1";
                    numbers = numbers.substring(3);
                    break;
                case 't':
                    if(numbers.charAt(1) == 'w') {
                        tmp += "2";
                        numbers = numbers.substring(3);
                    }
                    else {
                        tmp += "3";
                        numbers = numbers.substring(5);
                    }
                    break;
                case 'f':
                    if(numbers.charAt(1) == 'o') {
                        tmp += "4";
                        numbers = numbers.substring(4);
                    }
                    else {
                        tmp += "5";
                        numbers = numbers.substring(4);
                    }
                    break;
                case 's':
                    if(numbers.charAt(1) == 'i') {
                        tmp += "6";
                        numbers = numbers.substring(3);
                    }
                    else {
                        tmp += "7";
                        numbers = numbers.substring(5);
                    }
                    break;
                case 'e':
                    tmp += "8";
                    numbers = numbers.substring(5);
                    break;
                case 'n':
                    tmp += "9";
                    numbers = numbers.substring(4);
                    break;
                default:
                    tmp += "0";
                    numbers = numbers.substring(4);
                    break;
            }
        }
        answer = Integer.parseInt(tmp);

        return answer;
    }

    public static void main(String[] args) {
        EnglishToNum englishToNum = new EnglishToNum();
        String numbers = "onetwothreefourfivesixseveneightnine"	;
        System.out.println(englishToNum.solution(numbers));
    }
}
