package restudy.array.p0205;

import java.util.*;

/*
다른 강의에서 배웠던 해시 알고리즘처럼, 인덱스 = 숫자(데이터) 라고 볼 수 있겠다.
일단 a라는 숫자에 왔을 때, a가 0이면 a-1까지의 숫자들로 나누었을 때 나누어지지 않았다는, 즉 소수라는 의미이고
a가 1이면 a-1까지의 숫자들로 나누었을 때 나누어졌다는, 즉 소수가 아니라는 의미이다.
*/

public class LecSolution {
    public int solution(int n) {

        int answer = 0;
        int[] ch = new int[n+1];

        for(int i = 2; i <= n; i++) {

            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
