import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //학생 수(4)
        int n = kb.nextInt();
        //시험 수(3)
        int m = kb.nextInt();

        int[][] tests = new int[m+1][n+1];
        int[][] invertedTests = new int[n+1][m+1];

        //입력
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                tests[i][j] = kb.nextInt();
            }
        }

        //데이터 전환
        //인덱스가 등수임
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //i가 시험, j가 등수
                //학생 꺼냄
                int student = tests[i][j];
                invertedTests[student][i] = j;
            }
        }
        int result = 0;

        for (int[] i : invertedTests) {

            int max = Integer.MIN_VALUE;

            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
            //System.out.println("max = " + max);
            result += (4 - max);
            //System.out.println("result = " + result);
        }

        System.out.println(result - 4);
    }
}
