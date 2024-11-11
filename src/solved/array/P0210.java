package solved.array;

import java.util.Scanner;

//격자를 이차원 배열로 구현하는 건 알고 있었는데, 인덱스 바운드 초과 에러 나지 않게 겉에 한개씩 더 둘러주는 건 몰랐다.
//for문 안에서 변수 초기화하는 걸 잘 까먹고 놓치는 듯

public class P0210 {
    public static void main(String[] args) {

        /*
        * 2,2일때,
        상 1,2
        하 3,2
        좌 2,1
        우 2,3
        */

        //0 ~6까지인데, 실제로는 1 ~ 5까지, 5는 n + 2 -1하면 됨

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n+2][n+2];

        //입력
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                //상
                if (arr[i - 1][j] < arr[i][j]) {
                    cnt++;
                }
                //하
                if (arr[i + 1][j] < arr[i][j]) {
                    cnt++;
                }
                //좌
                if (arr[i][j - 1] < arr[i][j]) {
                    cnt++;
                }
                //우
                if (arr[i][j + 1] < arr[i][j]) {
                    cnt++;
                }

                if (cnt == 4) {
                    sum++;
                }
                cnt = 0;
            }
        }
        System.out.println(sum);
    }
}
