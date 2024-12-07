package restudy.twoPointersAndSlidingwindow.p0301;

import java.util.ArrayList;
import java.util.Scanner;

/*for문이든, while문이든 그 안에 if문이 내포되어 있다고 생각할 수 있다.
(굳이 따로 if문과 같이 사용하지 않아도 된다는 의미)*/

public class LecSolution {
    public ArrayList<Integer> solution (int n, int m, int[] a, int[] b) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 =0;

        while (p1 < n && p2 < m) {

            if(a[p1] < b[p2]) {
                answer.add(a[p1++]);
            }
            else {
                answer.add(b[p2++]);
            }
        }

        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i  < m; i++) {
            b[i] = kb.nextInt();
        }

        for (int x : T.solution(n,m,a,b)) System.out.print(x + " ");
    }
}
