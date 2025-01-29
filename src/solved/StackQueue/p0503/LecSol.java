package solved.StackQueue.p0503;

import java.util.*;

/*
-문제를 푸는 게 아님, 구현하고 개발하는 거임
문제라고 생각하고 어렵다고 생각하니까 진짜 어렵고 하기 싫은 것

 -2차원 배열로 하면 난장판 날 줄 알았는데, 생각보다 그 정도는 아니다.
그냥 내가 2차원 배열로 하려고 생각하니 지레 복잡하고 어려울 거라 생각했던 것
2차원 배열을 열 중심으로 탐색할 생각하니까 지레 겁먹었던 것
강의 풀이는 2차원 배열 사용해서 간단하게 해결했음

-실제로 테트리스 게임 같은 게 뒤에서 이런 식으로 작동하고 있는 듯?
*/

public class LecSol {

    public int solution(int[][] board, int[] moves) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        //열 중심 이차원 배열 탐색이므로 열을 바깥으로
        for (int pos : moves) {
            //행
            for (int i = 0; i < board.length; i++) {

                //인형이 있다는 것을 의미, 인형이 없다면 그냥 지나침(아무일도 일어나지 않음)
                if (board[i][pos - 1] != 0) {

                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;

                    //바구니가 비어있지 않고, 똑같다면(굳이 빼내지 않음)
                    if (!stack.isEmpty() && tmp == stack.peek()) {

                        answer += 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=kb.nextInt();
        System.out.println(T.solution(board, moves));
    }
}