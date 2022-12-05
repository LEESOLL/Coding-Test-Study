package programmers;

import java.util.Arrays;

public class TwoDimensionalArray {
    public int[][] solution (int[] num_list, int n) {
        int len = num_list.length/n;
        int idx = 0;
        int[][] answer = new int[len][n];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int[][] arr = twoDimensionalArray.solution(num_list, n);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
