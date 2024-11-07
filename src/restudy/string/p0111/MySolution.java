package restudy.string.p0111;

import java.util.Scanner;

public class MySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String result = "";

        int count = 1;

        for (int i = 1; i < input.length(); i++) {

            char c = input.charAt(i);
            char behind = input.charAt(i-1);

            if (c != behind) {

                result += behind;
                result += Integer.toString(count);
                count = 1;
            }
            else {
                count++;
            }
        }

        //마지막 문자 처리
        result += input.charAt(input.length() - 1);
        result += Integer.toString(count);

        //결과에서 1 제거
        result = result.replaceAll("1","");

        System.out.println(result);
    }
}

/*
한번에 전부 처리할 수 있다는 점에서 강의 풀이가 내 풀이보다 나은 것 같다.
나는 i, i+1을 비교하면 마지막에 바운드를 초과하는 인덱스 에러가 발생하므로 i, i-1을 비교했는데, 강의 풀이는 기존 문자열에 빈 문자열을 추가하고, 인덱싱을 마지막 전까지 함으로써 극복했다.
그래서 내 풀이처럼 마지막 문자를 처리하기 위해 코드 중복을 발생시킬 필요 없이 한번에 전부 처리했다.
*/