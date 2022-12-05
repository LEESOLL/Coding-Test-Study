package programmers;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static int[][] solution (int[] num_list, int n) {
        int len = num_list.length/n;
        int[][] answer = new int[1][len];

        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int[][] arr = solution(num_list, n);

        System.out.println(Arrays.stream(arr).toArray());

//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j] + " ");
//            }
//        }
    }
}
