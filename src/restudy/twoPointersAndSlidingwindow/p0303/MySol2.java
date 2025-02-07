package restudy.twoPointersAndSlidingwindow.p0303;

import java.util.Scanner;

/*
정답!
약간 나름의 체계가 잡히는데,
2개의 배열을 탐색해야할 때 -> 정렬 & 투포인터 알고리즘
1개의 배열을 탐색해야할 때 -> 투포인터 알고리즘 & 슬라이딩 윈도우
슬라이딩 윈도우의 핵심은 전처리와 이전 결과를 다음 연산에서 활용하는 것

처음에는 투포인터 알고리즘 + 겉으로만 슬라이딩 윈도우지 전부 하나하나 다시 계산하면서 더해주는 방식 취함, 결과는 시간초과
그래서 전처리로 따로 초기 윈도우를 구성하고, 기존 연산 결과를 활용하는 방법으로 바꿈(lt를 빼고, rt를 더하고)
*/

public class MySol2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            sales[i] = kb.nextInt();
        }

        //전처리, 초기 윈도우 구성
        int lt = 0;
        int rt = lt;
        int temp = 0;

        for (int i = 0; i < k; i++) {
            temp += sales[rt++];
        }
        max = temp;

        while (rt < sales.length) {

            temp -= sales[lt++];
            temp += sales[rt++];
            if (temp > max) max = temp;
        }

        System.out.print(max);
    }
}