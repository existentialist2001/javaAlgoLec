package restudy.array.p0205;

import java.util.*;

/*
다른 강의에서 배웠던 해시 알고리즘처럼, 인덱스 = 숫자(데이터) 라고 볼 수 있겠다.
일단 a라는 숫자에 왔을 때, a가 0이면 a-1까지의 숫자들로 나누었을 때 나누어지지 않았다는, 즉 소수라는 의미이고
a가 1이면 a-1까지의 숫자들로 나누었을 때 나누어졌다는, 즉 소수가 아니라는 의미이다.
*/

/*
2회독
강의 풀이 방식으로 풀려했는데 시간초과함,
자기 자신을 더하는 방식으로 배수표현하는 건 못떠올렸음,
근데 여전히 이중 for문인데?
이게 일차적으로 거르는 건 나랑 똑같은데,
배수를 걸러주는 과정에서, 나는 전부 나누어주면서 배수를 판별했는데 강의는 자기 자신을 더함으로써 연산 횟수를 줄였음.
같은 이중 for문이라해서 성능도 같은 것은 아니다.
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
