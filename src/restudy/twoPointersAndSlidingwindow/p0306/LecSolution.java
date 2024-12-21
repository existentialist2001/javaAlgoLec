package restudy.twoPointersAndSlidingwindow.p0306;

import java.util.Scanner;

public class LecSolution {

    public int solution(int n, int k, int[] arr) {

        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {

            //rt가 0이면 1로 바꿔 준 것으로 치고 그 횟수를 의미하는 cnt 증가
            if (arr[rt] == 0) cnt++;

            //그런데 가능한 변경 횟수 초과했다면, lt를 통해 조정
            while (cnt > k) {
                //lt가 0을 만나면, 이건 rt가 1로 바꿨던 거니 다시 0으로 바꿔 준 것으로 치고 cnt 감소
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args){

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
