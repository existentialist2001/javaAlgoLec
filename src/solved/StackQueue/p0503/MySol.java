package solved.StackQueue.p0503;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
int 2차원 배열 만들면, 복잡하고 난장판 날 것 같아서 잔머리써서 고민한 게,Stack 자료형에 대한 배열을 만드는 것
이 자료형이 제네릭까지 사용해서, 이런 배열을 써본 것은 이번이 처음이었다.
중간에 강의 사이트 함수 못읽어서 Stack -> Deque로 바꿈
이거 변수 선언만 해주면 안되고(그럼 null을 가르키게 됨), 객체를 생성해서 할당까지 해주어야 한다.

문제 입력을 보면, 정해진 입력 순서가 스택과 정반대라서, addLast 함수를 사용함
이것도 결국 예시분석 꼼꼼히 안해서 생긴 문제
앞으로 Deque를 그냥 앞뒤가 전부 열려있는 통로인데, 거기서 내가 스택처럼, 큐처럼 사용해준다고 생각하고 헷갈리지 말기

그리고 배열 그냥 한칸 더 만들어서 인덱스 맞추기, 이거 고민하는데 은근 시간 많이 걸림
*/

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int cnt = 0;

        //board, 이게 안된다는 법은 없지
        Deque<Integer>[] board = new Deque[n];

        //Stack 배열에 객체 할당
        for (int i = 0; i < n; i++) {
            board[i] = new LinkedList<Integer>();
        }

        //basket
        Stack<Integer> basket = new Stack<>();

        //입력(확인)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int doll = kb.nextInt();
                if (doll != 0) {
                    //분석
                    board[j].addLast(doll);
                }
            }
        }

        int m = kb.nextInt();
        int[] game = new int[m];

        for (int i = 0; i < m; i++) {
            game[i] = kb.nextInt();
        }

        //게임시작
        //전처리

        for (int i = 0; i < game.length; i++) {

            //확인
            int index = game[i] - 1;

            //그 칸이 비어있지 않으면
            if (!board[index].isEmpty()) {

                //기계로 꺼냄
                int pickedDoll = board[index].pop();

                    //기계로 집고 있는데, 바구니가 비었다 -> 넣어줌
                    if (basket.isEmpty()) {
                        basket.push(pickedDoll);
                    }
                    //바구니가 비지 않았다 -> 검사
                    else {
                        //바구니 위에거랑 기계에서 뽑은 게 같으면
                        int topDoll = basket.peek();
                        if (topDoll == pickedDoll) {

                            basket.pop();
                            cnt++;
                        }
                        //다르면
                        else {
                            basket.push(pickedDoll);
                        }
                    }
            }
        }
        System.out.println(cnt * 2);
    }
}