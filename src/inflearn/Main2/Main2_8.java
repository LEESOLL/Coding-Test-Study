package inflearn.Main2;

import java.util.*;

public class Main2_8 { // 인프런 2-8. 등수구하기
    static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr2 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        } // 배열 정렬

        for (int x : arr) {
            arrayList.add(x);
        }

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arrayList.indexOf(arr2[i]) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
