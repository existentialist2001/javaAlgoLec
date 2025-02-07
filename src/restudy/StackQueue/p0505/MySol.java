package restudy.StackQueue.p0505;

import java.util.Scanner;
import java.util.Stack;

/*
복잡하다 -> 어려울 것 같다 -> 못풀 것 같다 -> 진짜 못품
천천히, 차근차근 하나씩 접근 -> 풀어낼 수 있음
해결방안이 한번에 딱 떠오르는게 아니라, 생각을 발전시켜가면서 도달하는 거다.

문제 예시를 최대한 꼼꼼하게 분석하고,
코드도 최대한 구체적으로 구성하는게 코딩테스트의 핵심인 듯

문제에 괄호가 나온다? 뭔가 스택을 써야할 것 같은 느낌(강의도 이렇게 말함)
여태까지 스택 문제들 풀면서 느낀건데, 일단 넣기('('같은 경우)와 굳이 안넣고 검사하기(')'같은 경우)를 동시에 사용하는 경우가 많았다.
죽 굳이 꼭 스택에 넣어준 다음에 처리해주지 않아도 되는 거고, 일단 스택에 넣고봐도 되는

처음에 foreach문을 사용했는데, 인덱싱에서 문제가 생겼다.
이전 요소나 다음 요소를 참조할 수 없다는 점이 문제였다.
foreach문이 만능은 아니다.
그래서 for문으로 바꿈
for문도 나와 내 직전 요소를 탐색할 지, 나와 내 직후 요소를 탐색할지에 따라 다름
후자는 인덱싱이 까다로워서, 전자를 택함
예를들어 후자의 경우, 내 직후 요소를 건너뛰어도 될 때 그걸 하기가 까다로움
*/

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        char[] input = kb.nextLine().toCharArray();

        int result = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length; i++) {

            if (input[i] == ')') {
                //레이저인 경우
                if (input[i - 1] == '(') {

                    stack.pop();
                    result += stack.size();
                }
                //레이저가 아닌 경우, 쇠막대기 줄여주기
                else {

                    stack.pop();
                    result += 1;
                }
            }

            //더 직관적으로 하고 싶어서 else 안썼음
            else if (input[i] == '(') {
                stack.push(input[i]);
            }
        }

        System.out.println(result);
    }
}