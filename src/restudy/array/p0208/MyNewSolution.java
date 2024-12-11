package restudy.array.p0208;

//복습하면서 푼 내 풀이

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MyNewSolution {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Integer[] arr = new Integer[n];


        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //정렬
        Integer[] sortedArr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sortedArr,Collections.reverseOrder());

        for (int s : arr) {
            int count = 0;
            for (int i = 0; i < n; i++) {

                if (sortedArr[i] == s) {
                    System.out.print((i + 1) + " ");
                    break;
                }
            }
        }
    }
}