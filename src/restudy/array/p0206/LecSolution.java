package restudy.array.p0206;

import java.util.*;

public class LecSolution {
    public boolean isPrime(int num) {

        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            int tmp = arr[i];
            int res = 0;

            //숫자 뒤집기
            while(tmp > 0) {

                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            //뒤집은 숫자의 소수 여부를 판별하여, 소수인 숫자만 넣음
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
