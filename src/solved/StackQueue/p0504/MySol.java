package solved.StackQueue.p0504;

import java.util.Scanner;
import java.util.Stack;

/*
Deque보다 Stack이 더 직관적으로 느껴짐
그래도 자바 강의에서 Deque쓰라고 했으니 Deque 쓰자

후위식 연산, 덧셈, 곱셈과 달리 뺄셈과 나눗셈은 피연산자들의 순서 중요함, 이것 때문에 1번 실패

여태까지 스택 문제들 풀면서 느낀건데, 꼭 스택에 데이터들을 다 넣어준 후 처리할 필요X
여기서는 연산자

강의 풀이는 char을 int로 바꿀 때 아스키 넘버를 이용해 48을 빼주었는데, 그것보단 내 풀이의 클래스 함수를 쓰는 게 더 직관적으로 느껴짐
*/

public class MySol {
    public static void main(String[] args) {

       Scanner kb = new Scanner(System.in);

       char[] input = kb.nextLine().toCharArray();
       Stack<Integer> stack = new Stack<>();

       for (char c : input) {

           if (Character.isDigit(c)) {

               stack.push(Character.getNumericValue(c));
           }
           else {

               int a = stack.pop();
               int b = stack.pop();

               if (c == '+') stack.push(b + a);
               if (c == '-') stack.push(b - a);
               if (c == '*') stack.push(b * a);
               if (c == '/') stack.push(b / a);
           }
       }

        System.out.println(stack.pop());
    }
}