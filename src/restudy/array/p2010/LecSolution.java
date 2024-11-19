package restudy.array.p2010;

import java.util.*;

public class LecSolution {

    //행(상하)
    int[] dx = {-1,0,1,0};
    //열(좌우), 이렇게 구성하면 딱 시계방향
    int[] dy = {0,1,0,-1};

    public int solution(int n, int[][] arr) {

        int answer = 0;
        for (int i = 0; i < n; i++)  {
            for (int j = 0; j < n; j++) {

                //i,j까지는 특정 지점을 찍었고, 이제 그 상하좌우를 검사해주는 것
                boolean flag = true;
                for (int k = 0; k < 4; k++) {

                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {

                        //한번이라도 같거나 큰 게 나오면, 그 지점은 더 이상 봉우리가 아니니 break
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }
}
