package restudy.array.p0204;

/*내 풀이는 배열 챕터인데 배열을 사용하지 않고 푼 풀이
배열을 사용한 강의 풀이도 참고
근데 강의도 나처럼 배열 없이도 풀었음
수열이니까 배열을 떠올린 것 같고, 내 풀이보다 훨씬 직관적이고 단순하게 느껴진다.
문제 조건에서 나오는 부등호 꼼꼼하게 보기*/

import java.util.Scanner;

public class MySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prev = 0;
        int current = 1;
        int next = 0;

        System.out.print(current + " ");

        for (int i = 0; i < n - 1; i++) {

            next = prev + current;

            System.out.print(next + " ");

            prev = current;
            current = next;
        }
    }
}