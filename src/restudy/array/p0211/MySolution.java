package restudy.array.p0211;

import java.util.Scanner;

/*
틀림

강의 풀이도 내 풀이처럼 3중 for문으로 접근했는데..
어쨌든 3중 for문으로, 세로로 탐색하는 것 까지 같다.
자기자신 카운팅해도 상관없는 것 까지도 같다.
인덱스를 바로 학생으로 사용해주는 것도!
아, 특정 학생이랑 여러번 같은 반이여도 한 명으로 카운팅해야하는데, 중복 카운팅하고 있었다. 그래서 이 때 break를 해야함
이번에도 문제 조건 제대로 파악안함..
강의 풀이는 가로로 한줄씩 탐색하면서 비교했다면, 내 풀이는 세로로 한줄씩 탐색하면서 비교해서, break를 못써줌
그리고 강의 풀이처럼 배열을 한칸씩 더 만들어 아예 0번 인덱스를 배제하는 게 생각하기에 단순해서 더 좋은 듯
두 풀이 비교하면서, 강의 풀이 숙지하기
*/
public class MySolution {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[][] arr = new int[n][5];
       int max = Integer.MIN_VALUE;
       int tempMoniter = 0;
       int cnt = 0;

       //입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //i가 학생
        for (int i = 0; i < n; i++) {
            //j가 학년
            for (int j = 0; j < 5; j++) {

                int currentStudent = arr[i][j]; //(0,0), 9가 담겨있음
                //(0,1), 8이 담겨있음

                //이제 세로로 탐색, 0,0 / 1,0 / 2,0 / 3,0 / 4,0 /
                //0,1 // 1,1 //
                //세로 탐색
                for (int k = 0; k < n; k++) {

                    if (arr[k][j] == currentStudent) {
                        cnt++;
                    }
                }

            }

            if (cnt > max) {
                max = cnt;
                tempMoniter = i + 1;
            }
            cnt = 0;
        }
        System.out.println(tempMoniter);
    }
}
