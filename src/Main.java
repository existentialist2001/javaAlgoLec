import java.util.*;

public class Main {
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