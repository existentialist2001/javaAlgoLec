import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String answer = "NO";

        String essential = kb.nextLine();
        String plan = kb.nextLine();

        Deque<Character> eQueue = new LinkedList<>();
        Deque<Character> pQueue = new LinkedList<>();

        for (char c : essential.toCharArray()) {
            eQueue.offer(c);
        }

        for (char c : plan.toCharArray()) {
            pQueue.offer(c);
        }

        //연산
        while (!pQueue.isEmpty()) {

            char c = pQueue.poll();

            if (eQueue.contains(c)) {
                if (eQueue.getFirst() == c) {
                    eQueue.poll();

                    if (eQueue.isEmpty()) {

                        answer = "YES";
                        break;
                    }
                }
                else {

                    answer = "NO";
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}