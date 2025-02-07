import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        Deque<Integer> deque = new LinkedList<>();

        //실제 데이터 넣기, 연걸리스트니까 뒤에 넣어지는 거 맞음
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int cnt = 0;

        //뽑기 시작
        while (deque.size() != 1) {

                int prince = deque.removeFirst();
                cnt++;

                if (cnt == k) cnt = 0;
                else deque.add(prince);
        }

        System.out.print(deque.poll());
    }
}