package restudy.string.p0106;

import java.util.Scanner;

public class LecSolution {

    public String solution(String str) {

        String answer = "";

        for (int i = 0; i < str.length(); i++) {

            //System.out.println((str.charAt(i)) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        LecSolution T = new LecSolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

/*
주석을 출력해보면, 중복문자는 중복 등장할 때 처음 위치와 현재 위치가 다르다
따라서 처음 위치와 현재 위치가 같을 때(최초 등장할 때)만 결과에 더해주면 중복문자가 제거된 문자열을 얻을 수 있다
indexOf 함수가 문자의 처음 위치를 반환해주는 것을 이용하여 문제를 해결
*/