package solved.sortingAndSearching.p0602;

import java.util.Scanner;

/*
버블 정렬 - 거품(최대값 or 최소값)이 위로 올라가는(제일 뒤로 배치되는) 모양이라서 버블 정렬이라고 한다, 이렇게 이해함
버블 정렬의 시간 복잡도는 O(n^2)임, 점점 연산횟수가 감소한다고 하더라도 O(n^2)임 직접 계산해봤으니 의심X
*/

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //
        int temp = 0;

        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int c : arr) {
            System.out.print(c + " ");
        }
    }
}