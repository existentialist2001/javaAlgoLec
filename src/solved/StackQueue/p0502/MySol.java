package solved.StackQueue.p0502;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
Stack 자료구조 쓰려다가, 마지막에 출력 시 뒤집어 주는 게 번거로워 큐와 스택 모두로 사용할 수 있는 Deque 자료구조 사용함
이 자료구조를 내가 스택으로 쓰고 싶을 때는 스택처럼, 큐로 쓰고 싶을 때는 큐처럼 사용하면 됨
그리고 둘 모두 자료를 제거하지 않고 확인만 할 수 있는 peek 함수가 있음
*/

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        Deque<Character> stack = new LinkedList<>();

        String input = kb.nextLine();

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            stack.addLast(c);

            //넣고 검사, 닫힌 괄호라면 빼기 시작
            if (stack.peekLast() == ')') {


                while (true) {

                    char out = stack.removeLast();
                    if (out == '(') break;
                }
            }

        }

        while (!stack.isEmpty()) {
            System.out.print(stack.removeFirst());
        }
    }
}