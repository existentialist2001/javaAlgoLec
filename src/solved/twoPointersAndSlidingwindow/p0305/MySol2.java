package solved.twoPointersAndSlidingwindow.p0305;

import java.util.Scanner;

public class MySol2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        //전처리
        int lt = 1;
        int rt = lt;
        int sum = arr[lt];

        int cnt = 0;

        //연산
        while (true) {

            if (sum > n) {
                sum -= arr[lt++];
            }
            else if (sum < n) {

                rt++;
                if (rt >= arr.length) break;
                sum += arr[rt];
            }
            else {

                cnt++;
                rt++;
                if (rt >= arr.length) break;
                sum += arr[rt];
                sum -= arr[lt++];
            }
        }

        System.out.print(cnt);
    }
}