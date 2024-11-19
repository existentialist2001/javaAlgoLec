package restudy.array.p0212;

import java.util.*;

/*
틀림
2중 for문은 악이고, 3중 for문은 말할 것도 없다 생각했었는데, 이전 문제에서는 3중 for문을 쓰고, 이번 문제에서는 4중 for문을 쓴다. 선입견.
강의 풀이는 모든 경우를 조사해보겠다는 마인드인데, 컴퓨터는 인간보다 연산 속도가 빠르니까 그래도 된다. 난 근데 계속 뭔가 획기적인 방법을 떠올릴려고 했음.
강의 풀이는 쌍을 구성해서, 그걸 검사하는 식으로 접근. 애초에 강의 풀이처럼 생각한 적이 없었음.

그리고 이차원 배열 = 표 라고 생각하면 안헷갈리고, 특히 이중 for문에서 제일 바깥 = 행, 안 = 열 이라 생각하면 안헷갈림.
*/
public class LecSolution {
    public int solution(int n, int m, int[][] arr) {

        int answer = 0;
        //i와 j는 학생을 의미(배열로 구체화한 게 아닌, 추상적인 개념)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                //~번째 시험을 의미하는 k
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    //등수를 의미하는 s, 결국 등수를 찾아줌
                    for( int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,m,arr));
    }
}
