package restudy.string.p0106;

import java.util.Scanner;

public class MySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder temp = new StringBuilder(input);
        StringBuilder result = new StringBuilder();

        while (temp.length() > 0) {

            //맨 처음 문자를 넣어준다
            char c = temp.charAt(0);
            result.append(c);
            String s = Character.toString(c);

            //임시 문자열에서 처음 문자를 모두 제거해준다
            temp = new StringBuilder(temp.toString().replaceAll(s,""));
        }

        System.out.println(result);
    }
}

/*
-중복문자제거 문제여서, 중복문자를 찾아내고, 제거하는 것으로 접근했는데 30분 넘게 안풀리고 더욱 막막해졌다
그래서 "꼭 중복문자를 찾아야 하나?", "꼭 중복문자 제거에 delete 함수를 써야하나?"라고 생각했다 그래서
중복문자를 찾아내는 대신 아예 제거해주었고, replaceAll 함수를 사용하여 중복문자를 제거해주었다

-String과 StringBuilder 왔다갔다를 잘 해야겠다고 느낌

-문제에 제시된 예시가 전부가 아닐 거라는 태도로 접근

-강의는 indexOf 함수로 접근, 아이디어 참고
*/
