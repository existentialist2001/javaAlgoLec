package restudy.array.p0212;

import java.util.Scanner;

/*
첫번째에는 스스로 못풀었는데, 2회독 때는 풀어냈다.
보통 상태를 통해 문제를 해결할 때, true of false나 1과 -1을 가지고 많이했다.
하지만 이 문제를 풀면서 둘 다 가로막혔고, 그래서 상태 변수를 -1과 0, 1 세 가지로 늘렸다.
나름 여러 문제들 풀면서 습득한 노하우인데, 가로막힌다면 변수를 늘리는 걸 고민해봐야 한다.
*/

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[][] test = new int[m + 1][n + 1];
        int[][] result = new int[n + 1][n+ 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                test[i][j] = kb.nextInt();
            }
        }

        //
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n - 1; j++) {

                int stu = test[i][j];

                for (int k = j + 1; k <= n; k++) {

                    int targetStu = test[i][k];

                    //더 잘했을 때
                    if (result[targetStu][stu] == 0) {
                        result[stu][targetStu] = 1;
                    }

                    //서로 더 잘한적 있을 때
                    else if (result[targetStu][stu] == 1) {
                        result[stu][targetStu] = -1;
                        result[targetStu][stu] = -1;
                    }
                }
            }
        }

        int cnt = 0;
        for (int[] t : result) {
            for (int possible : t) {
                if (possible == 1) cnt++;
            }
        }

        System.out.println(cnt);
    }
}