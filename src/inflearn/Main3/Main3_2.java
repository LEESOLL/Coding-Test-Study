package inflearn.Main3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main3_2 { // 인프런 3-2. 공통원소구하기

    static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int pn = 0;
        int pm = 0;

        while(pn < n && pm < m) {
            if(arr1[pn] == arr2[pm]) {
                answer.add(arr1[pn]);
                pn++;
                pm++;
            } else if(arr1[pn] < arr2[pm]) {
                pn++;
            } else if(arr1[pn] > arr2[pm]) {
                pm++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int x : solution(n, arr1, m, arr2)) {
            System.out.print(x + " ");
        }
    }
}
