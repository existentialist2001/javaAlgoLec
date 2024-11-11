package solved.array;

import java.util.Scanner;

//행과 열을 분리하지 않고 한번의 이중 for문으로 접근할 수 있음
//행과 열의 길이가 다른 경우가 있을테니, length보다는 n으로 접근하는 게 좋았을듯

public class P0209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        //입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //행,열을 같이 한번에 계산
        for (int i = 0; i < n; i++) {

            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            max = Integer.max(max,Integer.max(rowSum,colSum));
        }

        //대각선
        //00 11 22 33 44
        //40 31 22 13 04 -> 합쳐서 4(길이 -1)가 되어야함
        //우하향 대각선
        int diagSum1 = 0;
        int diagSum2 = 0;
        for (int i = 0; i < n; i++) {

            diagSum1 += arr[i][i];
            diagSum2 += arr[i][arr.length - i - 1];
        }

        max = Integer.max(max,Integer.max(diagSum1,diagSum2));
        System.out.println(max);
    }
}
