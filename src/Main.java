import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        Deque<Integer> waitList = new LinkedList<>();

        int target = 0;

        for (int i = 0; i < n; i++) {

            int input = kb.nextInt();
            waitList.offer(input);

            if (i == m) {
                target = input;
            }
        }

        int max = 0;
        int cnt = 0;

        while (!waitList.isEmpty()) {

            int p = waitList.poll();
            max = p;

            //우선순위 검사
            for (int anotherP : waitList) {

                if (anotherP > p) {
                    max = anotherP;
                }
            }

            //최종 검사
            if (max == p) {

                cnt++;
                if (p == target) break;
            }
            else waitList.offer(p);
        }
        System.out.println(cnt);
    }
}