package restudy.array.p0211;

import java.util.*;

public class LecSolution {
    public int solution(int n, int[][] arr) {

        int answer = 0, max = 0;

        //기준이 되는 학생 i
        for (int i = 1; i <= n; i++) {

            int cnt = 0;

            //비교할 다른 학생 j
            for (int j = 1; j <= n; j++) {

                //이제 이 두 학생의 학년을 비교
                for (int k = 1; k <= 5; k++) {

                    //같은 반임이 확인되면 break하는 이유는 더 이상 비교하지 않아 중복을 세지 않기 위해(같은 반이 여러번이어도 1로 치니까)
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            //한 학생을 기준으로 다 비교하고 와서
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n,arr));
    }
}