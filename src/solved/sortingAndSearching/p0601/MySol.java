package solved.sortingAndSearching.p0601;

import java.util.Scanner;

/*
2년전 전공 수업에서 이론으로 배운 알고리즘 정렬 방법들 다 까먹었다;
선택 정렬 = 매 순간 최솟값을 선택한다, 이렇게 기억하기

시간복잡도 분석
자꾸 헷갈려서 또 정리
시간복잡도는 '정확한 계산'이 아니라 '카테고리화'임
이 주어진 상황은, 데이터가 n개면 연산횟수는 n-1 + n-2 + ... + 2임
즉 해당 문제의 선택 정렬의 시간복잡도는 첫항이 n - 1, 마지막 항이 2, 항의 개수가 n - 1개인 등차수열의 합으로 볼 수 있음
등차수열의 합 공식을 적용하면 1/2 * n^2 + 1/2 * n 이 나옴,
근데 시간복잡도의 목적은 알고리즘 성능의 '정확한 계산'이 아니라 '카테고리화'임
따라서 계수, 1차항, 상수항 다 배제하고 O(n^2)인 것

정리하자면, 선택정렬은 직관적이나 시간복잡도가 O(n^2)이라 좋은 성능이라고 할 수는 없을듯
*/

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int temp = 0;

        //연산
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {

                if (arr[j] < min) {

                    min = arr[j];
                    minIndex = j;
                }
            }
            //교환
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            min = Integer.MAX_VALUE;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}