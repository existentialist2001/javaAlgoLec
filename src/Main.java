import java.util.*;

public class Main {
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