package inflearn.Main3;

import java.util.Scanner;

public class Main3_1 { // 인프런 3-1. 두 배열 합치기

    static int[] solution(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[m + n];
        int pa = 0;
        int pn = 0;
        int pm = 0;

        while (pn < n && pm < m) {
            if (arr1[pn] < arr2[pm]) {
                answer[pa++] = arr1[pn++];
            } else {
                answer[pa++] = arr2[pm++];
            }
        }

        while (pm < m) {
            answer[pa++] = arr2[pm++];
        }

        while (pn < n) {
            answer[pa++] = arr1[pn++];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : solution(n, arr1, m, arr2))
            System.out.print(x + " ");
    }
}
