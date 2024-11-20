package restudy.array.p0204;

import java.util.*;

//배열을 사용한 강의 풀이

public class LecSolution {
    public int[] solution(int n) {

        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for (int x : T.solution(n)) System.out.print(x + " ");
    }
}
