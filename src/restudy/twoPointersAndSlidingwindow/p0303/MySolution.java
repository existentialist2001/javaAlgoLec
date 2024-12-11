package restudy.twoPointersAndSlidingwindow.p0303;

import java.util.Scanner;

/*
아 시간초과.. 강의 들으면서 느낀건데, 코딩 테스트의 핵심은 이중 for문으로부터의 탈피라고 느껴진다.(일단 이중 for문 쓰면 시간초과될 것 같은 느낌..)
sliding window, 미끄러지는 창문 알고리즘
전처리 해주고, 결과적으로 봤을 때 배열을 배열을 한번만 순회한다.
*/

public class MySolution {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int i = 0; i <= n - k; i++) {

            int sum  = arr[i];
            int index = i;

            for (int j = 1; j < k; j++) {

                index++;
                sum += arr[index];
            }

            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }

        System.out.println(max);
    }
}